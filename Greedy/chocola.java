package Greedy;
import java.util.*;
public class chocola {
    public static void breakDown(int n, int m, Integer costVer[], Integer costHori[])
    {
        //sort them in descending order
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHori, Collections.reverseOrder());

        int h = 0, v=0; //vertical and horizontal pointers that will work on costVer and costHori
        int hp = 1, vp = 1; //vertical and horizontal pieces checker
        int cost=0;
        //compare horizonatal and vertical until they reach the length till they can be compared
        while(h<costHori.length && v<costVer.length)
        {
            if(costVer[v]>costHori[h]) //vertical cut
            {
                cost += costVer[v] * hp;//number of hori pieces * cost of that vert peice
                vp++;//number of vertpieces increases
                v++;// incremeneting the vert pointer to point to the next cost
            }
            else//horizontalcut
            {
                cost += costHori[h] * vp; //number of vertical pieces * cost of that hori peice
                hp++; //number of horipieces increases
                h++; // incremeneting the hori pointer to point to the next cost
            }
        }
        //remaining vertical cost adding
        while(v<costVer.length)
        {
            cost += costVer[v] * hp;
            vp++;
            v++;
        }
        //remaining horizontal cost adding
        while(h<costHori.length)
        {
            cost += costHori[h] * vp;
            hp++;
            h++;
        }
        System.out.println("The minimum cost is "+ cost);
    }
    public static void main(String[] args) {
        int n=4; int m=6;
        Integer costVer[] = {2, 1, 3, 1, 4};
        Integer costHori[] = {4, 1, 2};
        breakDown(n, m, costVer, costHori);
    }
}
