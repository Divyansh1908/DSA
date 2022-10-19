public class Butterfly {
    public static void butter(int width)
    {
        // First Half
        for(int i=1; i<=width/2; i++) //Divide the total width in 2 parts; here we will go from 1 to 4 in first half
        {
            // all these for run for 1 row
            for(int k = 0; k<width/2; k++) //Printing left triangle with spaces
            {
                if(k<i) 
                {
                    //if the value of k is less than i then print a star
                    //1st row - 0 < 1 = 0 -> 1 star 
                    //2nd row - 0 < 2 = 1 -> 2 star
                    //3rd row - 0 < 3 = 2 -> 3 star
                    //4th row - 0 < 4 = 3 -> 4 star
                    System.out.print("*");
                }
                else{ // else print a space
                    //1st row -> 3 space
                    //2nd row -> 2 space
                    //3rd row -> 1 space
                    //4th row -> 0 space
                    System.out.print(" ");
                }

            }
            for(int j = width/2; j>0; j--)
            {
                if(j>i)
                {
                    //if the value of j is greater than i then print a space
                    //1st - 4 > 1 = 3 -> 3 space 
                    //2nd - 4 > 2 = 2 -> 2 space
                    //3rd - 4 > 3 = 1 -> 1 space
                    //4th  - 4 > 4 = 0 -> 0 space
                    System.out.print(" ");
                }
                else{
                    //1st -> 1 Star 
                    //2nd -> 2 Star
                    //3rd -> 3 Star
                    //4th -> 4 Star
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        //Second Half
        for(int i=width/2; i>=1; i--) //Divide the total width in 2 parts; here we will go from 4 to 1 in second half
        {
            //Same as first half
            for(int k = 0; k<width/2; k++) 
            {
                if(k<i)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            for(int j = width/2; j>0; j--)
            {
                if(j>i)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int width = 8;
        butter(width);

    }
}
