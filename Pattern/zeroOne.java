public class zeroOne {
    public static void zeOn(int breadth)
    {
        int a = 1;
        for(int i=0; i<breadth; i++)
        {
            if(i%2==0) // for every even line start the number with 1
            {
                a=1;
                for(int j=0; j<=i; j++)
                {
                    System.out.print(a);
                    if(a==0) // switch to 0 if 1 and vice versa
                    {
                        a=1;
                    }
                    else
                    {
                        a=0;
                    }
                }
            } 
            else
            {
            a=0; // fpr every odd line start the number with 0
            for(int j=0; j<=i; j++)
                {
                    System.out.print(a);
                    if(a==0)
                    {
                         a=1;
                    }
                    else
                    {
                        a=0;
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int breadth = 4;
        zeOn(breadth);
    }
}
