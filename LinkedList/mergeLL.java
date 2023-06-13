package LinkedList;

public class mergeLL {
    public static class Node{
        int data;
        Node next;
        //initialise the first node of the linkedlist
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data) //O(1)
        {
            //Step1 - create new node (At all times)
            Node newNode = new Node(data);
            size++;
            //edge case - If LL is empty
            {
                if(head==null)
                {
                    head = tail = newNode;
                    return;
                }
            }
            //Step2 - new node's next is now head
            newNode.next = head; 
            //Step3 -  make new node the head
            head = newNode;
        }
        public void printList() //O(n)
        {
            if(head==null)
            {
                System.out.println("LL is empty");
            }
            Node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println();
        }
    public static Node head;
    public static Node tail;
    public static int size;

    ////////////////////////////////////////
    public Node mid(Node head)
    {
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node mergeSort(Node head)
    {
        if(head == null || head.next == null) // in both cases the LL is already sorted
        {
            return head;
        }
        //find mid
        Node mid1 = mid(head);
        //left and right part set
        Node rightHead = mid1.next;
        Node leftHead = head;
        mid1.next = null;
        
        //divide left and right parts and reach the ends
        Node newLeft = mergeSort(leftHead);
        Node newRight = mergeSort(rightHead);

        //merge the two sorted lists
        return merge(newLeft, newRight);
    }
    public Node merge(Node left, Node right)
    {
        Node mergeLL = new Node(-1); //intialise new node with -1
        Node temp = mergeLL; //temp pointing the head of mergeLL
        while(left!=null && right!=null) //if either one of them gets fineeshed then exit
        {
            if(left.data <= right.data)
            {
                temp.next = left; //point temporary LL to left
                left = left.next; //increment the left
                temp = temp.next; //increment the temp
            }
            else
            {
                temp.next = right; //point temporary LL to right
                right = right.next; //increment the right
                temp = temp.next; //increment the temp
            }
        }
        while(left!=null) //fill rest of the elements on the left
        {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while(right!=null) //fill rest of the elements on the right
        {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        return mergeLL.next; //skip the first node coz that is -1
    }
    public static void main(String[] args) {
        mergeLL ll = new mergeLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printList();
        ll.head = ll.mergeSort(head);
        ll.printList();
    }
}
