package Queue;

import java.util.*;

public class reverseKElem {
    //using stack o(n) + s(qu.size)
    public static void reversalStack(Queue<Integer> qu, int k)
    {
        Stack<Integer> st = new Stack<>();
        int remainingS = qu.size()-k;
        for(int i=0; i<k; i++) //put the first k element in stack
        {
            st.push(qu.poll());
        }
        while(!st.isEmpty()) // remove from stack which will reverse them and then push it onto the queue
        {                    //[60, 70, 80, 90, 100, 50, 40, 30, 20, 10]
            qu.add(st.pop());
        }
        for(int i =0; i<remainingS; i++)  //remove from start of the queue and put it back in the queue for the remaining elements
        {
            qu.add(qu.poll());
        }
        System.out.println(qu);
    }

    //using deque o(n) + s(qu.size)
    public static void reversalDeque(Queue<Integer> qu, int k)
    {
        Deque<Integer> deq = new LinkedList<>();
        for(int i=0; i<k; i++) //used add first method to put first k elements in reverse order in deq
        {
            deq.addFirst(qu.poll());
        }
        while(!qu.isEmpty())
        {
            deq.addLast(qu.poll());//used add last method to put the remaining elements in the natural order
        }
        System.out.println(deq);
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);
        int k = 5;
        //reversalStack(queue, k);
        reversalDeque(queue, k);

    }
}
