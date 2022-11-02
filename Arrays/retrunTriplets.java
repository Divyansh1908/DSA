import java.util.*;
public class retrunTriplets {
    public static List<List<Integer>> triplet(int arr[])
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>(); //ArrayList of List to store each triplet
        // Traversing through each element to get all possible triplets
        for(int i=0; i< arr.length; i++)
        {
            for(int j= i+1; j<arr.length; j++)
            {
                for(int k = i+2; k<arr.length; k++)
                {
                    if(arr[i] + arr[j] + arr[k] == 0) //If sum of all the values is 0
                    {
                        List<Integer> tript = new ArrayList<Integer>();
                        tript.add(arr[i]); // Add each element in the interior arraylist
                        tript.add(arr[j]);
                        tript.add(arr[k]);
                        Collections.sort(tript); //Sort the interior arraylist
                        result.add(tript); //add the interior arraylist to the extrior arraylist
                    }
                }
            }
        }
        result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>> (result)); //Putting all the values of the resultant arraylist in hashmap to get the unique values
        return result; // Returned the arraylist
    }
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        int arr2[] = {};
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result = triplet(arr);
        System.out.println(result);
    }
}
