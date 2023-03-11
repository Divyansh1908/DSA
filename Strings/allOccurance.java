public class allOccurance {
    public static void occur(int[] arr, int key, int i)
    {
        if(i == arr.length)
        {
            return;
        }
        if(arr[i] == key)
        {
            System.out.println(i);
        }
        occur(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        occur(arr, 2, 0);
    }
}
