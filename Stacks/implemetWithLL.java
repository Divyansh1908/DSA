package Stacks;

public class implemetWithLL {
    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    static class Stackss
    {
        static Node head = null;
        public static boolean isEmpty()
        {
            return head ==null;
        }
        public static void push(int data)
        {
            Node newNode = new Node(data);
            if(isEmpty())
            {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop()
        {
            if(isEmpty())
            {
                return Integer.MIN_VALUE;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peak()
        {
            if(isEmpty())
            {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stackss st = new Stackss();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        while(!st.isEmpty())
        {
            System.out.println(st.peak());
            st.pop();
        }
    }
}
