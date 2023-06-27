package Queue;
import java.util.*;
public class interleaveq {
    public static void interleaving(Queue<Integer> first)
    {
        Queue<Integer> second = new ArrayDeque<>();
        int size = first.size()/2;
        for(int i=0; i<size; i++) // putting first half of queue in second
        {
            second.add(first.poll());
        }
        while(!second.isEmpty()) // adding the values of second in first then first in first.
        {
            first.add(second.poll());
            first.add(first.poll());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> qu = new ArrayDeque<>();
        for(int i=1; i<=10; i++)
        {
            qu.add(i);
        }
        interleaving(qu);
        System.out.println(qu);

    }
}
