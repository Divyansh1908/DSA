package Queue;
import java.util.*;
public class implementationArr {
    static class Qu{
        static int arr[];
        static int size;
        static int rear;

        Qu(int sizes){
            this.arr = new int[sizes];
            this.size = sizes;
            this.rear = -1;
        }

        //isEmpty()
        public static boolean isEmpty()
        {
            if(rear == -1)
            {
                System.out.println("Empty Queue");
                return true;
            }
            return false;
        }

        //add - O(1)
        public static void add(int data)
        {
            if(rear == size-1) System.out.println("Queue is Full");
            rear = rear+1;
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
            //save front
            int front = arr[0];
            //move each forward
            for(int i=0; i<rear; i++) //REAR
            {
                arr[i] = arr[i+1];
            }
            //decrement rear
            rear--;
            return front; //coz front wala element gayab hogaya naa
        }

        //peek - O(1)
        public static int peek()
        {
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Qu queue = new Qu(7);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        while(!queue.isEmpty())
        {
            System.out.println(queue.remove());         
        }
    }
}
