package Stacks;
import java.util.*;
public class implementWithJCF {
    public static void main(String[] args) {
        //using java collections framework
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        while(!st.isEmpty())
        {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
