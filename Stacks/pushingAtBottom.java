package Stacks;

import java.util.*;

public class pushingAtBottom {
    public static void pushs(Stack<Integer> st, int data)
    {
        if(st.isEmpty())
        {
            st.push(data);
            return;
        }
        int top = st.pop();
        pushs(st, data);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        pushs(st, 12);
        System.out.println(st);
    }
}
