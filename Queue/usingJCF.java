package Queue;
import java.util.*;
public class usingJCF {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue1 = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        while(!queue.isEmpty())
        {
            System.out.println(queue.remove());         
        }
        queue1.add(55);
        queue1.add(66);
        queue1.add(77);
        queue1.add(88);
        while(!queue1.isEmpty())
        {
            System.out.println(queue1.remove());         
        }
    }
}
