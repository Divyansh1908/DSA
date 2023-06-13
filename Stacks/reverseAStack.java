package Stacks;
import java.util.*;
public class reverseAStack {
    public static void reverseSt(Stack<Integer> st)
    { //reverse all the element in the stack
        if(st.isEmpty())
        {
            return; // when the Stack is empty, reverse
        }
        int top = st.pop(); //removes all the element in the stack
        reverseSt(st); //recurse until empty
        pushAtBot(st, top); //while coming back, take each element and push it to bottom of the stack
                                // here that element acts as a "data" in the pushAtBot
    }
    public static void pushAtBot(Stack<Integer> st, int data)
    {
        if(st.isEmpty())
        {
            st.push(data);
            return;
        }
        int top = st.pop(); //this "top" is for all the remaining element that need to put back
        pushAtBot(st,data);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        reverseSt(st);
        System.out.println(st);

    }
}
