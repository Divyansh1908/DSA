import java.util.HashMap;

public class romanToInt {

    public static int romant(String s) {
        HashMap <Character, Integer> roman = new HashMap<Character, Integer>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        
        int sum = 0;
        
        for(int i=s.length()-1; i>=1;i--)
        {
            if((roman.get(s.charAt(i)))>(roman.get(s.charAt(i-1))))
            {
                sum = sum + ((roman.get(s.charAt(i))) - (roman.get(s.charAt(i-1))));
                System.out.print(s.charAt(i)+" if se");
                System.out.println(sum);
                i=i-1;
                if(i==0)
                {
                    return sum;
                }
            }
            else
            {
                char checker = s.charAt(i);
                System.out.print(checker+" else se");
                sum = sum + roman.get(checker);
                System.out.println(sum);
            }
        }
        sum = sum + roman.get(s.charAt(0));
        System.out.println(s.charAt(0)+" pehla");
        return sum;
    }
    public static void main(String[] args) {
        int a  = romant("MCMXCIV");
        System.out.println(a);
    }
}
