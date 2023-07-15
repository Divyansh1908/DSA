package BinaryTrees;
import java.util.*;
public class kthLevel {
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
    static List<Integer> arr = new ArrayList<>();
    public static void kThLevel(Node root, int level, int target)
    {
        if(root == null)
        {
            return;
        }
        if(level == target)
        {
            arr.add(root.data);
            return;
        }
        kThLevel(root.left, level+1, target);
        kThLevel(root.right, level+1, target);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node (2) ;
        root.right = new Node (3) ;
        root. left. left = new Node (4) ;
        root.left.right = new Node (5) ;
        root.right. left = new Node (6) ;
        root.right.right = new Node(7) ;
        kThLevel(root,  0, 2);
        System.out.println(arr);
    }
}
