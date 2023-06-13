package BackTrack;
import java.util.*;
public class longestSubarraySliding {
    public static void subarr(int[] arr, int k)
    {
        int left = 0, right = 0;
        int sum = arr[0]; //sum = first elem in arr
        int maxlen = 0;//to store the maxlength
        //while right exceed naa ho
        //while sum > k and left < right hume sum -= a[left]; left++; // while exceeding
        //if sum == k maxlen = maxlen, right-left+1
        //move right and then add to the sum, check again right exceed

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1};
        int k= 3;
        subarr(arr, k);
    }
}
