package Queue;

import java.util.Stack;

public class usingTwoStackPop {
    static class queue
    {
        static Stack<Integer> st1 = new Stack<>();
        static Stack<Integer> st2 = new Stack<>();
        //isEmpty - O(1)
        public static boolean isEmpty()
        {
            return st1.isEmpty();
        }
        //add - O(1)
        public static void add(int data)
        {
            st1.push(data);
        }
        //remove - O(N)
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return Integer.MIN_VALUE;
            }
            //if stack 1 is not empty put everything in stack 2
            while(!st1.isEmpty())
            {
                st2.push(st1.pop());
            }
            //remove top element from stack 2
            int removed  = st2.peek();
            st2.pop();
            //put all the elements of stack 2 back in stack 1
            while(!st2.isEmpty())
            {
                st1.push(st2.pop());
            }
            return removed;
        }
        //peek - O(N)
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return Integer.MIN_VALUE;
            }
            //if stack 1 is not empty put everything in stack 2
            while(!st1.isEmpty())
            {
                st2.push(st1.pop());
            }
            //remove top element from stack 2
            int peeked  = st2.peek();
            //put all the elements of stack 2 back in stack 1
            while(!st2.isEmpty())
            {
                st1.push(st2.pop());
            }
            return peeked;
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
