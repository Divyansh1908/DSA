package Queue;

public class circularQWithArr {
    static class Qu{
        static int arr[];
        static int size;
        static int rear;
        static int front; //keep track of front as well

        Qu(int sizes){
            this.arr = new int[sizes];
            this.size = sizes;
            this.rear = -1;
            this.front = -1;
        }

        //isEmpty()
        public static boolean isEmpty()
        {
            if(rear == -1 && front == -1)
            {
                System.out.println("Empty Queue");
                return true;
            }
            return false;
        }

        //isFull
        public static boolean isFull()
        { // agar rear ke agla wala front hai matlab ki full hai
            if((rear+1)%size == front) return true;
            return false;
        }

        //add - O(1)
        public static void add(int data)
        {
            if(isFull()) System.out.println("Queue is Full");
            if(front == -1) front = 0; // For the very first element; we have moved the rear but we also have to bring front to 0 as it is -1;
            rear = (rear+1)%size; //pehle rear ko update then add data
            arr[rear] = data;
        }

        //remove - O(n)
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Empty Queue");
                return -1;
            }
            int removed = arr[front];
            //if removing the very last element then make sure everything is reset
            if(front == rear)
            {
                front = rear = -1;
            }
            else //just move the font one step ahead
            {
                front = (front+1)%size;
            }
            return removed;
        }

        //peek - O(1)
        public static int peek()
        {
            if(isEmpty()) 
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Qu queue = new Qu(3);
        queue.add(1); //1
        queue.add(2); //1->2
        queue.add(3); //1->2->3
        queue.remove(); //2->3
        queue.add(4); //2->3->4
        while(!queue.isEmpty())
        {
            System.out.println(queue.remove());         
        }
    }
}
