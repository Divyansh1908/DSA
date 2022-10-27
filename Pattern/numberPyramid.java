public class numberPyramid {
    public static void number(int width)
    {
        for(int i= 1; i<=width; i++)
        {
            for(int j = width-i; j>0; j--) // Print Spaces to the left 
            {
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++) // Print the space + the number
            {
                System.out.print(" "+i);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int breadth = 5;
        number(breadth);
    }
}
