
//TC - O(n)
public class kadenesAlgoMaxSubArr {
    public static void kadene(int arr[])
    {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        boolean check = true;

        for(int i=0; i<arr.length; i++)
        {
            currentSum += arr[i]; //adding current sum to our element at the ith position
            if(currentSum<0) // If current sum becomes less than 0 then reset the current sum to 0
            {
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum); // Compare current sum with max sum
        }
        System.out.println(maxSum);
    
        
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadene(arr);
    }
}
