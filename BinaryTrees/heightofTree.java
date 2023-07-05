package BinaryTrees;

public class heightofTree {
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
    public static int height(Node root) //max depth/height of tree
    {
        if(root==null)
        {
            return 0;
        }
        int leftHeight = height(root.left);
        int righHeight = height(root.right);
        return Math.max(leftHeight, righHeight)+1;
    }
    public static int count(Node root) //count of nodes
    {
        if(root==null)
        {
            return 0;
        }
        int leftC = count(root.left);
        int righC = count(root.right);
        return (leftC + righC)+1;
    }
    public static int sum(Node root) //sum of nodes - recursive
    {
        if(root==null)
        {
            return 0;
        }
        int leftS = sum(root.left);
        int righS = sum(root.right);
        return (leftS + righS)+root.data;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node (2) ;
        root.right = new Node (3) ;
        root. left. left = new Node (4) ;
        root.left.right = new Node (5) ;
        root.right. left = new Node (6) ;
        root.right.right = new Node(7) ;
        int h = height(root);
        System.out.println(h);
        int c = count(root);
        System.out.println(c);
        int s = sum(root);
        System.out.println(s);
    }
}
