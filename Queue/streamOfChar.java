package Queue;
import java.util.*;
public class streamOfChar {
    public static char[] nonRepeatCheck(String a)
    {
        char[] ans = new char[a.length()];
        int[] freq = new int[26];
        Queue<Character> q = new ArrayDeque<Character>();
        for(int i=0; i<a.length(); i++)
        {
            char ch = a.charAt(i); 
            q.add(ch); //add in the queue
            freq[ch-'a']++; //add the frequency
            while(!q.isEmpty() && freq[q.peek()-'a']>1) //while the peek is >1 keep removing
            {
                q.poll();
            }
            if(q.isEmpty()) //if empty then no repeating char
            {
                ans[i] = '0';
            }
            else{ //else it is the peek of the queue
                ans[i] = q.peek();
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String a = "aabccxb";
        char[] arr = nonRepeatCheck(a);
        for(int i=0; i<arr.length; i++)
	    {
            System.out.print(arr[i]+" ");
	    }
        System.out.println();
    }
}
