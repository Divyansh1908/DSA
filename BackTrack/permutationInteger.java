package BackTrack;

import java.util.*;

public class permutationInteger {
    public static void permu(int index, int[] arr, List<List<Integer>> abs )
    {
        //base case
        if(index == arr.length)
        {
            List<Integer> ap = new ArrayList<>();
            for(int i=0; i<arr.length; i++)
            {
                ap.add(arr[i]);
            }
            if(!abs.contains(ap))
            {
                abs.add(ap);
            }
            return;
        }
        //recursion
        for(int i=index; i<arr.length; i++)
        {
            swap(index, i, arr);
            permu(index+1, arr, abs);
            swap(index, i, arr);
        }
    }
    public static void swap(int i, int j, int[] arr)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,3};
        List<List<Integer>> abs = new ArrayList<>();
        permu(0, arr, abs);
        for(List<Integer> ab: abs)
        {
            for(Integer i: ab)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
