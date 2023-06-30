package Queue;

import java.util.*;

public class generateBinary {
    public static void binary(int value)
    {
        Queue<String> qu = new ArrayDeque<>();
        qu.add("1");
        while(value-- >0)
        {
            String s1 = qu.remove();
            System.out.println(s1);
            String s2 = s1;
            qu.add(s1+"0");
            qu.add(s2+"1");
        }
    }
    public static void main(String[] args) {
        int value = 10;
        binary(value);
    }
}
