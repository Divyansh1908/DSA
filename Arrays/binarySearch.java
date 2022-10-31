// TC = O(logn)
import java.util.Arrays;

public class binarySearch {
    public static int check(int arr[], int key)
    {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(key == arr[mid])
            {
                return mid;
            }
            else if(arr[mid] > key) // Considering only left
            {
                end = mid-1;
            }
            else // Considering ony right
            {
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,6,12,45,87,98,110,115};
        int key = 110;
        int val = check(arr,key);
        System.out.println("Found at "+ val);
    }
}
