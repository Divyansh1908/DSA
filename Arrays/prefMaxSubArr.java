// TC - O(n2)
public class prefMaxSubArr {
    public static void prefix(int arr[])
    {
        int maxSum = Integer.MIN_VALUE;
        int pref[] = new int[arr.length];
        pref[0] = arr[0]; //Initialising first element
        for(int i=1; i<arr.length; i++) // To get the Prefix Array
        {
            pref[i] = pref[i-1]+arr[i]; // Sum of the all previous elements + the current
        }
        // Calculating Sum
        for(int i = 0; i<pref.length; i++)
        {
            int start = i; //Initialising start of the subarray
            int sum =0;
            for(int j=i; j<pref.length; j++)
            {
                int end = j; //Initialising end of the subarray
                if(start == 0) //For 0th element - All sums are equal to the end sum stored in each index of the Prefix array - because it was made that way.
                {
                    sum = pref[end];
                }
                else //For all other elements use this formula to calculate sum for each subarray that does not start from 0.
                {
                    sum = pref[end] - pref[start-1];
                }
            }
            if(sum> maxSum) // Comparing sum with max
            {
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        int arr1[] = {-3, -2, -6, -1, -3};
        int arr2[] = {3, 2, 6, 1, 3};
        prefix(arr2);
    }
}
