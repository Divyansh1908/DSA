import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class elementRepitition {
    public static boolean repeat(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean withArrayList(int arr[])
    {
        // Integer array To Integer Arraylist
        List<Integer> intList = new ArrayList<Integer>(arr.length);
        for (int i : arr)
        {
            intList.add(i);
        }
        for(int i = 0; i<arr.length; i++)
        {
            int count = Collections.frequency(intList, arr[i]);
            if(count>=2)
            {
                return true;
            }
        }
        System.out.println(intList);
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int arr2[] = {1,2,3,1};
        int arr3[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean a = repeat(arr3);
        System.out.println(a);

        boolean b = withArrayList(arr3);
        System.out.println(b);
    }
}
