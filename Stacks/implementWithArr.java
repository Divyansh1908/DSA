package Stacks;

import java.util.*;

public class implementWithArr {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty()
        {
            return list.isEmpty();
        }
        public static void push(int x) {
            list.add(x); //O(1) 
        }
        public static int pop()
        {
            if(isEmpty()) //represents that stack is empty
            {
                return -1;
            }
            int a = list.get(list.size()-1);
            list.remove(list.size()-1); //O(1)
            return a;
        }
        public static int peak()
        {
            if(isEmpty()) //represents that stack is empty
            {
                return -1;
            }
            return list.get(list.size()-1); //O(1)
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        while(!st.isEmpty())
        {
            System.out.println(st.peak());
            st.pop();
        }

    }
}
