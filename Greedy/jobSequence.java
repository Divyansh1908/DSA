package Greedy;
import java.util.*;
public class jobSequence {
    public static class jobs
    {
        int timePeriod;
        int profit;
        int id; //job id which will be shown later

        public jobs(int i, int p, int id)
        {
            this.timePeriod=i;
            this.profit=p;
            this.id = id;
        }
    }
    public static void main(String[] args) {
        int[][] jobsInfo = {{1,40}, {1,30}, {4,20}, {1,10}};
        ArrayList<jobs> arr = new ArrayList<>();

        for(int i=0; i<jobsInfo.length; i++)
        {
            arr.add(new jobs(jobsInfo[i][0], jobsInfo[i][1], i));
        }
        //Collections.sort(arr, (obj1, obj2) -> obj1.profit-obj2.profit); //ascending order
        Collections.sort(arr, (obj1, obj2) -> obj2.profit-obj1.profit); //descending order
        ArrayList<Integer> ans  = new ArrayList<>();
        int time = 0;
        for(int i=0; i<arr.size(); i++)
        {
            if(arr.get(i).timePeriod>time)
            {
                ans.add(arr.get(i).id);
                time++;
            }
        }
        System.out.println("size is"+ ans.size());
        System.out.println("Job sequence is: ");
        for(int i=0; i<ans.size(); i++)
        {
            System.out.println(ans.get(i));
        }
    }
}
