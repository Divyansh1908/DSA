package Queue;

import java.util.*;

public class qqwithLL {
    static class Node{
        int data; 
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    static class queue{
        static Node head = null;
        static Node tail = null;
         //isEmpty()
        public static boolean isEmpty()
        {
           if(head == null && tail == null)
           {
                return true;
           }
           return false;
        }

        //add - O(1)
        public static void add(int data)
        {
            Node newNode = new Node(data);
            if(head == null)
            {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //remove - O(1)
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return Integer.MIN_VALUE;
            }
            int val = head.data;
            //single element
            if(tail == head)
            {
                tail=head=null;
            }
            else{ // if many elements
                head = head.next;
            }
            return val;
        }

        //peek - O(1)
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return Integer.MIN_VALUE;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        queue queue = new queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        while(!queue.isEmpty())
        {
            System.out.println(queue.remove());         
        }
    }
}
