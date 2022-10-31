// TC - O(n)
// SC - O(1)
public class reverseArr {
    public static int[] rev(int arr[])
    {
        int start = 0;
        int end = arr.length - 1 ;
        // Swap 1st and last -> 2nd and secondlast .....
        while(start<end)
        {
            int temp = -1;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }
    public static void printArr(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,6,12,45,87,98,110,115};
        int brr[] = rev(arr);
        printArr(brr);
    }
}
