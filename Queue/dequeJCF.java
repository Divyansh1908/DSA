package Queue;
import java.util.*;
public class dequeJCF {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.addLast(3);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        deque.addLast(4);
        deque.addFirst(5);
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
    }
}
