//TC - O(n)
public class linearSearch {
    public static void printArr(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static int linSearch(int arr[], int key)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 7;

        int ans = linSearch(arr, key);
        if(ans == -1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element Found at Index: "+ans);
        }
    }
}
