//binary search recursively
public class sortedRotatedArr {
    public static int search(int arr[], int target, int start, int end)
    {
        //basecase
        if(start>end)
        {
            return -1;
        }
        //kaam
        //finding mid
        int mid = start +(end-start)/2;

        //FOUND ON MID
        if(arr[mid]==target)
        {
            return mid;
        }
        //moving to Line 1
        else if(arr[start]<=arr[mid])
        {
            //case a --- left side of line 1
            if(arr[start]<=target && target<=arr[mid])
            {
                return search(arr, target, start, mid-1); //one elem less than mid
            }
            //case b - right side of mid of line 1
            else
            {
                return search(arr, target, mid+1, end);
            }
        }
        //moving to Line 2
        else
        {
            //case c --- right side of line 2
            if(arr[mid]<=target && target<=arr[end])
            {
                return search(arr, target, mid+1, end); //one elem less than mid
            }
            //case d - left side of mid of line 2
            else
            {
                return search(arr, target, start, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = search(arr, target, 0, arr.length-1);
        System.out.println(ans);
    }
}
