package Greedy;
import java.util.*;
public class activitySelection {
    public static void main(String[] args) { //o(nlogn)
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9}; //already sorted based on end time

        //IF SORTING BASED ON END
        //using comparators
        int[][] sortingEnding = new int[start.length][3];
        for(int i=0; i<start.length; i++)
        {
            sortingEnding[i][0] = i;
            sortingEnding[i][1]=start[i];
            sortingEnding[i][2]=end[i];
        }
        Arrays.sort(sortingEnding, Comparator.comparingDouble(o -> o[2]));
        //

        //intitializing the variabes
        int maxAct = 0;
        ArrayList<Integer> ar =new ArrayList<>();

        //add activity 1 anyways
        maxAct =1;
        ar.add(sortingEnding[0][0]);
        int lastEnd = sortingEnding[0][2];
        for(int i =1; i<end.length; i++)
        {
            if(lastEnd<=sortingEnding[i][1])
            {
                ar.add(sortingEnding[i][0]); //add the index of the element that was added
                maxAct++; //increment the maxAct
                lastEnd=sortingEnding[i][2]; //update the end[]i
            }
        }
        System.out.println(maxAct);
        System.out.println(ar);
    }
}
