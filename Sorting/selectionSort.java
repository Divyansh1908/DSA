//TC - O(N2)
public class selectionSort {
    public static void sorting(int nums[])
    {
        for(int i=0; i<nums.length-1; i++) // Outer loop running from 0 -> n-2 // coz end tak aate aate last elem max hoga so no need to compare that
        {
            int min = i; //Initialising min to the current index
            for(int j=i+1; j< nums.length; j++) //Check for minimum element in unsorted array
            {
                if(nums[min]>nums[j])
                {
                    min = j; // Put index of min as the one which is smaller than current min
                }
            }
            // Swap the min element from the current element
            System.out.println(nums[min] +" "+nums[i]);
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
        for(int i=0; i<nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }
    }

    public static void DescendingSorting(int nums[])
    {
        for(int i=0; i<nums.length-1; i++) // Outer loop running from 0 -> n-2
        {
            int min = i; // Initialising min to the current index
            for(int j=i+1; j< nums.length; j++) //Check for minimum element in unsorted array
            {
                if(nums[min]<nums[j]) // ONLY CHANGE THIS
                {
                    min = j; // Put index of min as the one which is smaller than current min
                }
            }
            // Swap the min element from the current element
            System.out.println(nums[min] +" "+nums[i]);
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
        for(int i=0; i<nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {5,4,1,3,2};
        int nums1[] = {5,4,1,3,2};
        sorting(nums);
        DescendingSorting(nums1);
    }
    
}
