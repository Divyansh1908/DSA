//TC - O(n)
public class largestInArr {
    public static int checks(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>largest)
            {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {4,6,12,98,45,87,110};
        int maxu = checks(arr);
        System.out.println(maxu);
    }
}
