package BinaryTrees;

import java.util.*;

public class preorder {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data = data;
            left=null;
            right=null;
        }
    }
    public static class binaryTree{
        static int idx = -1;
        public static Node preorder(int[] nodes)
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = preorder(nodes);
            newNode.right = preorder(nodes);
            return newNode;
        }
        public static void pre(Node root) // PREORDER o(n)
        {
            if(root == null)
            {
                //System.out.println("-1"); //if I do this then I get the answer in the form of the input provided
                return;
            }
            System.out.print(root.data+" "); //root
            pre(root.left); //left
            pre(root.right); //right
        }
        public static void in(Node root) //INORDER
        {
            if(root==null)
            {
                //System.out.print("-1 ");
                return;
            }
            in(root.left); //left
            System.out.print(root.data+" "); //root
            in(root.right); //right
        }
        public static void post(Node root) //POSTORDER
        {
            if(root==null)
            {
                // System.out.print("-1 ");
                return;
            }
            post(root.left); //left
            post(root.right); //right
            System.out.print(root.data+" "); //root
        }
        public static void level(Node root)
        {
            if(root == null) //the tree is empty
            {
                return;
            }

            Queue<Node> qu = new LinkedList<>();
            qu.add(root); //adding the root element
            qu.add(null); //adding the first line break after level 1

            while(!qu.isEmpty())
            {
                Node currNode = qu.remove();
                if(currNode == null)
                {
                    System.out.println();
                    if(qu.isEmpty())
                    {
                        break;
                    }
                    else
                    {
                        qu.add(null);
                    }
                }
                else
                {
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null)
                    {
                        qu.add(currNode.left);
                    }
                    if(currNode.right != null)
                    {
                        qu.add(currNode.right);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree bt = new binaryTree();
        Node root = bt.preorder(nodes);
        bt.pre(root);
        System.out.println();
        bt.in(root);
        System.out.println();
        bt.post(root);
        System.out.println();
        bt.level(root);
    }
}
