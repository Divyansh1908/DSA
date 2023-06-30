package Greedy;
import java.util.*;
public class indianCoins {
    public static int coinChange(Integer[] coins, int target)
    {
        int minChange = 0;
        Arrays.sort(coins, Comparator.reverseOrder());
        for(int i=0; i<coins.length; i++)
        {
            if(coins[i]<=target)
            {
                while(coins[i]<=target)
                {
                    minChange++;
                    target -= coins[i];
                }
            }
        }
        return minChange;
    }
    public static void main(String[] args) {
        Integer[] coins = {1,2,5,10,20,50,100,500,2000};
        int target = 590; //500+50+20+20
        int target1 = 121; //100+20+1
        System.out.println("Minimum number of change is "+coinChange(coins, target));
    }
}
