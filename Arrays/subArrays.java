//TC - O(n3)
// Total Sum of Subarrays - n(n+1)/2
public class subArrays {
    public static void printSub(int arr[])
    {
        int totalSub = 0;
        for(int i=0; i<arr.length; i++) // to get start
        {
            int start = i;
            for(int j=i; j<arr.length; j++) //To get end
            {
                int end = j;
                for(int k = start; k<=end; k++) // To print from start to end of that subarray
                {
                    System.out.print(arr[k]+" ");
                }
                totalSub++;
                System.out.println();
            }
        }
        System.out.println(totalSub);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printSub(arr);
    }
}
