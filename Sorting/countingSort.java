public class countingSort {
    public static void counting(int nums[])
    {
        int largest = Integer.MIN_VALUE;
        // To find the max value in the array to set a range for count array
        for(int i=0; i< nums.length; i++)
        {
            largest = Math.max(largest, nums[i]);
        }
        //Initialising the count array
        int count[] = new int[largest+1];

        //Putting frequency of numbers in the count array
        for(int i=0; i< nums.length; i++)
        {
            count[nums[i]]++; //Increment the corresponding index of the number by 1
        }

        int j=0; // Will be used to count position in the resultant array
        for(int i=0; i<count.length; i++)
        {
            while(count[i]>0) //jabtak count of a number is above 0
            {
                nums[j] = i; 
                j++;
                count[i]--; // Reduce count value
            }
        }
        for(int i=0; i<nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }
    }   
    public static void main(String[] args) {
        int abc[] = {1,4,1,3,2,4,3,7};
        counting(abc);
    }
}
