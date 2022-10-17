import java.util.*;

public class reverseOfNumber {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        while(a>0)
        {
            int n = a%10;
            System.out.print(n+" ");
            a = a/10;
        }
        System.out.println();
        sc.close();
    }
}
