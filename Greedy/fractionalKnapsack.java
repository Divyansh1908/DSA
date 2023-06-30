package Greedy;

import java.util.*;


public class fractionalKnapsack {
    public static int knapsack(int[] value, int[] weight, int target)
    {
        int maxVal = 0;
        double[][] ratio = new double[value.length][2]; //storing index and ratio of each value/weight
        for(int i=0; i<value.length; i++)
        {
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); //sort based on ratios - Higher the ratio better value it will get for its weight
        for(int i=ratio.length-1; i>=0; i--) //we want in decreaseing order 6,5,4 etc, coz higher ration values go in first as they will yield the max value for its weight
        {
            if(weight[(int)ratio[i][0]]<=target) //if the weight at that index is <=target
            {
                maxVal += value[(int)ratio[i][0]]; //increement value
                target -= weight[(int)ratio[i][0]]; //reduce the weight added
            }
            else
            {
                maxVal += ratio[i][1]*target; //muliply ratio * weight to get value
                    //if target is 0 then nothing will be added to max val after multiplication
                break; //break coz the target is met
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int target = 50;
        int max = knapsack(value, weight, target);
        System.out.println(max);
    }
}
