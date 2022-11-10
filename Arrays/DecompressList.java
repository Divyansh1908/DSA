// Leetcode - 1313
public class DecompressList {
    public static int[] decompressRLElist(int[] nums) {
        int count = 0;
        int sum =0;
        //Finding length of Resultant array
        for(int i=0; i<nums.length; i+=2)
        {
            sum+=nums[i];
        }
        int num1[] = new int[sum];
        //Filling out the Resultant array
        for(int i=0; i<nums.length; i+=2)
        {
            int freq = nums[i];
            int val = nums[i+1];
            for(int j=0; j<freq; j++)
            {
                num1[count] = val;
                count++;
            }
        }
        return num1;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        decompressRLElist(a);

    }
}
