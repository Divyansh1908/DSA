package Queue;
import java.util.*;
public class usingTwoQueuePop {
    //stack using two queue
    static class stack
    {
        static Queue<Integer> q1 = new ArrayDeque<>();
        static Queue<Integer> q2 = new ArrayDeque<>();
        //isEmpty
        public static boolean isEmpty()
        {
            return q1.isEmpty() && q2.isEmpty();
        }
        //add
        public static void add(int data)
        {
            //add in whichever queue is not empty
            if(!q1.isEmpty())
            {
                q1.add(data);
            }
            else{
                q2.add(data);
            }
        }
        public static int removes()
        {
            if(isEmpty())
            {
                System.out.println("Stack is Empty");
                return Integer.MIN_VALUE;
            }
            int top = -1;
            //case 1
            if(!q1.isEmpty())
            {
                while(!q1.isEmpty()) //while not empty consider the following
                                    //if empty then top will have the answer
                                    //otherwise add it to the q2 queue.
                {
                    top = q1.remove();
                    if(q1.isEmpty())
                    {
                        break;
                    }
                    q2.add(top);
                }
            }
            else //if q2 contains all the values
            {
                while(!q2.isEmpty()) //while not empty consider the following
                                    //if empty then top will have the answer
                                    //otherwise add it to the q1 queue.
                {
                    top = q2.remove();
                    if(q2.isEmpty())
                    {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Stack is Empty");
                return Integer.MIN_VALUE;
            }
            int top = -1;
            //case 1
            if(!q1.isEmpty())
            {
                while(!q1.isEmpty()) //while not empty consider the following
                                    //if empty then top will have the answer
                                    //otherwise add it to the q2 queue.
                {
                    top = q1.remove();
                    q2.add(top);
                }
            }
            else //if q2 contains all the values
            {
                while(!q2.isEmpty()) //while not empty consider the following
                                    //if empty then top will have the answer
                                    //otherwise add it to the q1 queue.
                {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
        public static void main(String[] args) {
        stack stack= new stack();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        while(!stack.isEmpty())
        {
            System.out.println(stack.removes());         
        }
        }
    }
}
