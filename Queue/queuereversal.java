package Queue;

import java.util.*;

public class queuereversal {
    public static void reverse(Queue<Integer> qu)
    {
        Stack<Integer> st = new Stack<>();
        while(!qu.isEmpty())
        {
            st.push(qu.poll());
        }
        while(!st.isEmpty())
        {
            qu.add(st.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> qu = new ArrayDeque<>();
        for(int i=1; i<=10; i++)
        {
            qu.add(i);
        }
        reverse(qu);
        System.out.println(qu);
    }
}
