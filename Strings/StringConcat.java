// This Program Takes all possible number from integer array and concatenates them, further it adds the all the of them to get a sum

public class StringConcat {
    public static long solution(int[] a) {
        int result[] = new int[a.length*a.length];
        int count = 0;
        long p = 0;
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length; j++)
            {
                String c = Integer.toString(a[i]);
                String d = Integer.toString(a[j]);
                String ans = c+d;
                int xyz = Integer.parseInt(ans);
                result[count] = xyz;
                count++;
            }
        }
        for(int i=0; i<result.length; i++)
        {
           p = p + result[i];
        }
        return p;
    }
    public static void main(String[] args) {
        int a[] = {10,2};
        int b[] = {1,2,3};
        long x = solution(b);
        System.out.println(x);
    }
}
