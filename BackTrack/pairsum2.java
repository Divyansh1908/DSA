package BackTrack;

import java.util.ArrayList;
// o(n)
public class pairsum2 {
    public static void sum(ArrayList<Integer> abc, int target)
    {
        int start =0;
        int end=0;
        //breakpoint
        for(int i=0; i<abc.size(); i++)
        {
            if(abc.get(i)>abc.get(i+1)) 
            {
                start=i+1;
                end=i;
                break;
            }
        }
        // moving and rotating the pointers until sum is reached
        while(start!=end)
        {
            int sum1 = abc.get(start)+abc.get(end);
            if(sum1 == target)
            {
                System.out.println(abc.get(start)+" "+abc.get(end));
            }
            if(sum1<target)
            {
                start = (start+1)%abc.size();
            }
            else
            {
                end = (abc.size()+end - 1)%abc.size();
            }
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> abc = new ArrayList<>();
        abc.add(11);
        abc.add(15);
        abc.add(6);
        abc.add(8);
        abc.add(9);
        abc.add(10);
        sum(abc, 16);
    }
}
