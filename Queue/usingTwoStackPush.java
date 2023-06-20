package Queue;

import java.util.*;

public class usingTwoStackPush {
    static class queue
    {
        static Stack<Integer> st1 = new Stack<>();
        static Stack<Integer> st2 = new Stack<>();
        //isEmpty
        public static boolean isEmpty()
        {
            return st1.isEmpty();
        }
        //add
        public static void add(int data)
        {
            //if stack 1 is not empty put everything in stack 2
            while(!st1.isEmpty())
            {
                st2.push(st1.pop());
            }
            //put new element in stack 1
            st1.push(data);
            //put all the elements of stack 2 back in stack 1
            while(!st2.isEmpty())
            {
                st1.push(st2.pop());
            }
        }
        //remove
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return Integer.MIN_VALUE;
            }
            int removed = st1.pop();
            return removed;
        }
        //peek
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
            }
            return st1.peek();
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
