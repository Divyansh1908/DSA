package LinkedList;

public class doublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data)
    {
        //step1
        Node newNode = new Node(data);
        size++;
        //edge case
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        //step2
        newNode.next = head;
        //step3
        head.prev = newNode;
        //step4
        head = newNode;
    }
    public void addLast(int data)
    {
        //step1
        Node newNode = new Node(data);
        size++;
        //edge case
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        //step2
        tail.next = newNode;
        //step3
        newNode.prev = tail;
        //Step 4
        tail = newNode;
    }
    public int removeFirst()
    {
        if(head == null)
        {
            System.out.println("Doubly LL is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    public int removeLast()
    {
        if(head == null)
        {
            System.out.println("Doubly LL is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            int val = tail.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        //remove tail
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }
    public void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void reverseDLL()
    {
        Node curr = head;
        Node preva = null;
        Node nexta;
        while(curr!=null)
        {
            nexta = curr.next;
            curr.next = preva;
            curr.prev = nexta; // extra step that flips the previous becuase it is equally important
            preva = curr;
            curr = nexta;
        }
        head = preva;
    }
    public static void main(String[] args) {
        doublyLL d = new doublyLL();
        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        d.addLast(0);
        d.print();
        d.reverseDLL();
        d.print();
        System.out.println(d.size);
        d.print();
        d.removeFirst();
        d.print();
        System.out.println(d.size);
        d.removeLast();
        d.print();
        System.out.println(d.size);

    }
}
