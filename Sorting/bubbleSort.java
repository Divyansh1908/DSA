//Bubble Sort - O(N2)
public class bubbleSort {
    public static void sorts(int nums[])
    {
        int turns = 0;

        for(int i=0; i< nums.length-1; i++)
        {
            int swaps = 0; // Edge Case -  To check if the array is already sorted or no -- Optimised code now has a TC of O(N)
            for(int j=0; j< nums.length-1-turns; j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                    swaps++; // Increment swap after each iteration
                }
            }
            if(swaps==0)
            {
                // After the first iteration if there was no swap we return that the array was already sorted and break out of the for loop
                System.out.println("Array already Sorted");
                break;
            }
        }
        for(int i=0; i<nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {5,4,1,3,2};
        int nums1[] = {1,2,3,4,5};
        sorts(nums1);
    }
}
