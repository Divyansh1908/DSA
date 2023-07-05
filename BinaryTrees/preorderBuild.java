package BinaryTrees;
import java.util.*;

public class preorderBuild { //o(n)
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
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree bt = new binaryTree();
        Node root = bt.preorder(nodes);
        System.out.println(root.data);
    }
}
