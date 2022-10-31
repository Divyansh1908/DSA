// Brute Force - TC - O(n3)
public class maxSubArraySum {
    public static void max(int arr[])
    {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) // to get start
        {
            int start = i;
            for(int j=i; j<arr.length; j++) //To get end
            {
                int sum = 0;
                int end = j;
                for(int k = start; k<=end; k++) // To get sum of each element in the subarray
                {
                    sum = sum + arr[k];
                }
                if(sum>maxSum) //Swapping value of maxSum if current sum is greater than it
                {
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        int arr1[] = {-3, -2, -6, -1, -3};
        int arr2[] = {3, 2, 6, 1, 3};
        max(arr2);
    }
}
