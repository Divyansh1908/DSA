package Stacks;

import java.util.Stack;
import java.util.*;

public class reverseString {
    public static String reverse(String abc)
    {
        Stack<Character> st = new Stack<>();

        for(int i=0; i<abc.length(); i++)
        {
            st.push(abc.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String abc = "ron";
        String reverse = reverse(abc);
        System.out.println(reverse);
    }
}
