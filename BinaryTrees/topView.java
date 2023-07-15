package BinaryTrees;
import java.util.*;
public class topView {
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

    public static class Info //bundling node and horizontal distance together
    {
        Node node;
        int horiD;

        public Info(Node node, int horiD)
        {
            this.node = node;
            this.horiD = horiD;
        }
    }
    public static void top(Node root)
    {
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> hs = new HashMap<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        q.add(new Info(root, 0)); //adding the root node and its horizontal Distance as root and 0
        q.add(null);

        while(!q.isEmpty())
        {
            Info curr = q.remove();
            if(curr == null) //if current is null
            {
                if(q.isEmpty()) //if after that the queue becomes null means we have completed all our steps
                {
                    break;
                }
                else // else add back the null
                {
                    q.add(null);
                }
            }
            else //if current is not null
            {
                if(!hs.containsKey(curr.horiD)) //check if the hashmap already has the horiDistance of the current node - if not then proceed inside
                {
                    hs.put(curr.horiD, curr.node); //add the horizontal distance and the current node
                }
                if(curr.node.left != null) // if the value on the left of the node is not null
                {
                    q.add(new Info(curr.node.left, curr.horiD-1)); // add the node and its distance -1 (packaged in Info) to the queue
                    min = Math.min(curr.horiD-1, min); //check for minimum as it wont affect the max as going left is always -1
                }
                if(curr.node.right != null)
                {
                    q.add(new Info(curr.node.right, curr.horiD+1)); //same as above: just opposite
                    max = Math.max(curr.horiD+1, max);
                }
            }
        }
        System.out.println("TOP VIEW");
        for(int i= min; i<=max; i++) //go from min to max and print the order in which we will see the tree from the top
        {
            System.out.print(hs.get(i).data+" "); //hs.get(i) gives node hence hs.get(i).data gives value
        }
        System.out.println();
        System.out.println("RIGHT VIEW"); // all positive hori distance
        for(int i= 0; i<=max; i++) //go from 0 to max and print the order in which we will see the tree from the right
        {
            System.out.print(hs.get(i).data+" "); //hs.get(i) gives node hence hs.get(i).data gives value
        }
        System.out.println();
        System.out.println("LEFT VIEW"); //all negative hori distance
        for(int i= 0; i>=min; i--) //go from 0 to min and print the order in which we will see the tree from the left
        {
            System.out.print(hs.get(i).data+" "); //hs.get(i) gives node hence hs.get(i).data gives value
        }
        System.out.println();
        System.out.println("BOTTOM VIEW"); // reverse of Top View
        for(int i= max; i>=min; i--) //go from max to min and print the order in which we will see the tree from the bottom
        {
            System.out.print(hs.get(i).data+" "); //hs.get(i) gives node hence hs.get(i).data gives value
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node (2) ;
        root.right = new Node (3) ;
        root. left. left = new Node (4) ;
        root.left.right = new Node (5) ;
        root.right. left = new Node (6) ;
        root.right.right = new Node(7) ;

        top(root);
    }
}
