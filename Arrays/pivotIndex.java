// Leetcode - 724
public class pivotIndex {
    public static int pivotIndex1(int[] nums) {
        int arrLeft[] = new int[nums.length];
        int arrRight[] = new int[nums.length];
        int ans = 0;
        arrLeft[0] = nums[0];
        arrRight[nums.length-1] = nums[nums.length-1];
        //LeftMaxArray
        for(int i= 1; i<nums.length; i++)
        {
            arrLeft[i] = nums[i] + arrLeft[i-1];
        }
        //RightMaxArray
        for(int i= nums.length-2; i>=0 ; i--)
        {
            arrRight[i] = nums[i] + arrRight[i+1];
        }  
        
        

        for(int i=0; i<arrLeft.length; i++)
        {
            System.out.println(arrLeft[i]);
        }
        System.out.println();
        for(int i=0; i<arrRight.length; i++)
        {
            System.out.println(arrRight[i]);
        }

        // Comparing
        for(int i=0; i<=nums.length-1; i++)
        {
            if(arrLeft[i] == arrRight[i])
            {
                System.out.println("Yes");
                ans = i;
                break;
            }
            else
            {
                ans = -1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1,7,3,6,5,6};
        int a = pivotIndex1(nums);
        System.out.println(a);
    }
}