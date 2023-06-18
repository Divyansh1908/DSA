//TC - O(N2)
public class insertionSort {
    public static void sortser(int nums[])
    {
        for(int i=1;i< nums.length; i++)
        {
            int current = nums[i]; // FOR START - Assigning current as the 2nd number in the array at 1 index
            int previous = i-1;  // index of all elements behind that here element at index 0 is considerd at previous element
            // Finding correct position to insert and pushing all data behind
            while (previous >=0 && nums[previous]>current) // jabtak previouse bada hoga current tab tak move karte raho aage.
            {
                nums[previous+1] = nums[previous];
                previous--;
            }
            // Inserting our number
            nums[previous+1] = current; //the number is already -- after that it checks for -1 which is false: hence previous+1 = 0 ie nums[0]
        }

        for(int i=0; i<nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }
    }



    public static void DescendingSortser(int nums[])
    {
        for(int i=1;i< nums.length; i++)
        {
            int current = nums[i]; // FOR START - Assigning current as the 2nd number in the array at 1 index
            int previous = i-1;  // index of all elements behind that here element at index 0 is considerd at previous element
            // Finding correct position to insert and pushing all data behind
            while (previous >=0 && nums[previous]<current) //JUST CHANGE THE SIGN
            {
                nums[previous+1] = nums[previous];
                previous--;
            }
            // Inserting our number
            nums[previous+1] = current;
        }

        for(int i=0; i<nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {5,4,1,3,2};
        int nums1[] = {1,2,3,4,5};
        sortser(nums);
    }

}
