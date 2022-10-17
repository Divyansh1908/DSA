import java.util.*;
import java.lang.*;
public class BasicPattern
{
    public static void main(String args[])
    {
        // Inverted 
        for(int i = 5; i>0; i--)
        {
            for(int j=0; j<=i-1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // Forward
        for(int i = 1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
