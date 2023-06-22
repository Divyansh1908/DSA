package LinkedList;

import javax.swing.plaf.ColorUIResource;

public class leanLL {
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
    public static Node head;
    public static Node tail;
    public static int size; //size of LL
    
    // we will use function instead

    // adding to LL
        //add first - aage dhakka dega
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

        //add Last - peeche dhakka dega
        public void addLast(int data) //o(1)
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
            tail.next = newNode; 
            //Step3 -  make new node the head
            tail = newNode;
        }
        // Print Linked List
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
        // add in the middle of LL
        public void addInMid(int index, int data)
        {
            //basecase
            if(index == 0)
            {
                addFirst(data);
                return;
            }
            //Step1 - create new node (At all times)
            Node newNode = new Node(data);
            size++;
            //step 1 reach the index before the one you want to add
            Node temp = head;
            int i = 0;
            while(i<index-1) //at index-2 it will actually be at index-1 due to temp.next getting executed afterwards
            {
                temp = temp.next;
                i++;
            }
            // By this time temp is at second last.
            
            //Step3 - point new node to the index of temp.next
            newNode.next = temp.next;
            //Step4 - point temp to new node
            temp.next = newNode;
        }

        // Remove
            //Remove First - Get value of the node you are removing
            public int removeFirst()
            {
                if(size == 0)
                {
                    System.out.println("LL is empty");
                    return Integer.MIN_VALUE; //returning -infinite for a distinct value that does not clash!
                }
                else if(size == 1)
                {
                    int val = head.data;
                    head = tail = null;
                    size=0;
                    return val;
                }
                int val = head.data;
                head = head.next;
                size--;
                return val;
            }
            //Remove last - 
            public int removeLast()
            {
                if(size == 0)
                {
                    System.out.println("LL is empty");
                    return Integer.MIN_VALUE; //returning -infinite for a distinct value that does not clash!
                }
                else if(size == 1)
                {
                    int val = head.data;
                    head = tail = null;
                    size=0;
                    return val;
                }
                
                //reach i=size-2 (2nd last)
                Node prevTemp = head;
                int i=0;
                while(i<size-2)
                {
                    prevTemp = prevTemp.next;
                    i++;
                }

                int val = prevTemp.next.data; //tail ka data
                //make next of 2nd last to null
                prevTemp.next = null;
                //make second last as tail
                tail = prevTemp;
                size--;
                return val;
            }
            public int iterSearch(int key)
            {
                Node temp = head;
                int i=0;
                while(temp!=null)
                {
                    if(temp.data == key)
                    {
                        return i;
                    }
                    else
                    {
                        temp = temp.next;
                        i++;
                    }
                }
                return -1;
            }
            public int helper(Node head, int key)
            {
                //going in and checking
                if(head == null)
                {
                    //if reached the end then return -1
                    return -1;
                }
                if(head.data == key)
                {
                    return 0;
                }
                int idx =  helper(head.next, key);
                //backtracking
                //if(-1 is returned from the found idx then return -1)
                if(idx == -1)
                {
                    return -1;
                }
                //else return the idx++ value
                return idx+1;
            }
            public int recSearch(int key)
            {
                return helper(head, key);
            }

            public void reverseLL()
            {
                Node curr = tail = head; // initialise the head as the new tail and also the first elem that we are gonna search
                Node prev = null;
                Node next;
                while(curr!=null)
                {
                    next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                }
                //updating the head node at the last coz at this point curr would be null and 
                // prev would have the last elem in the LL which needs to be the first coz we just reversed it
                head = prev;
            }
            public static void removeCycle()
            {
                //detect cycle
                Node slow = head;
                Node fast = head;
                boolean cycle = false;
                while(fast != null && fast.next != null)
                {
                    slow = slow.next;
                    fast = fast.next.next;
                    if(slow == fast)
                    {
                        cycle = true;
                        break;
                    }
                }
                if(cycle == false)
                {
                    return;
                }
                //find meeting point
                slow = head;
                Node lastNode = null;
                while(slow != fast)
                {
                    slow = slow.next;
                    lastNode = fast;
                    fast = fast.next;
                }
                //remove cycle 
                lastNode.next = null;
            }    
    public static void main(String[] args) {
        leanLL ll = new leanLL();
        ll.addFirst(1); //1->null
        ll.addFirst(2); // 2->1->null
        ll.addLast(3); // 2->1->3->null
        ll.addLast(4); // 2->1->3->4->null
        ll.addInMid(2, 5); //2->1->5->3->4->null
        System.out.println("Size"+ll.size);
        ll.printList();
        int a = ll.removeFirst(); //removing 2; 1->5->3->4->null
        System.out.println("Removed first"+a);
        ll.printList();
        int b = ll.removeLast();
        System.out.println("Removed last"+b);
        ll.printList();
        System.out.println("Size"+ll.size);
        System.out.println(ll.iterSearch(5));
        System.out.println(ll.recSearch(5));
        ll.reverseLL();
        System.out.println("ReverseLL Below");
        ll.printList();
    }
}
