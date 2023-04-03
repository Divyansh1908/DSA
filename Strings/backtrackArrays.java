public class backtrackArrays {
    public static void back(int[] arr, int start, int val)
    {
        //base case
        if(start == arr.length)
        {
            printArr(arr);
            return;
        }
        //recursion
        arr[start] = val; // while going to base case the array gets filled from 1 to 5 [1, 2, 3, 4, 5]
        back(arr, start+1, val+1);
        arr[start] = arr[start]-2; //adter reaching the base case they start returning and the values get changed by
                        // current val- 2 which means the array at the end of whole function is [-1,0,1,2,3]
    }
    public static void printArr(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        back(arr, 0, 1);
        printArr(arr);
    }
}
