public class Diamond {
    public static void Dia(int width)
    {
        /*  Here I will split the code into 2 fragmnets - 1 will be a regular pyramid and another will be a inverted rotated half pyramid with nothing on top 
            --- *
            --* **
            -** ***
            *** ****

        */     
        
        // First Half
        for(int i=1; i<=width/2; i++) // Traversing each row
        {
            for(int j = width/2; j>1; j--) //Printing the inverted rotated half pyramid with nothing on top (using j>1 and not j>0)
            {
                if(j>i)
                {
                    //if the value of j is greater than i then print a space
                    //1st - 4 > 1 = 3 -> 3 space 
                    //2nd - 4 > 2 = 2 -> 2 space
                    //3rd - 4 > 3 = 1 -> 1 space
                    //4th  - 4 > 4 = 0 -> 0 space
                    System.out.print("-");
                }
                else{
                    //1st -> 1 Star 
                    //2nd -> 2 Star
                    //3rd -> 3 Star
                    //4th -> 4 Star
                    System.out.print("*");
                }
            }
            for(int k = 0; k<width/2; k++) //Printing regular pyramid on the right
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
            System.out.println();
            }


        // Second Half - Reverse of 1st Half
        for(int i=width/2; i>0; i--) //Divide the total width in 2 parts; here we will go from 4 to 1 in second half
        {
            for(int j = width/2; j>1; j--)
            {
                if(j>i)
                {
                    //if the value of j is greater than i then print a space
                    //1st - 4 > 1 = 3 -> 3 space 
                    //2nd - 4 > 2 = 2 -> 2 space
                    //3rd - 4 > 3 = 1 -> 1 space
                    //4th  - 4 > 4 = 0 -> 0 space
                    System.out.print("-");
                }
                else{
                    //1st -> 1 Star 
                    //2nd -> 2 Star
                    //3rd -> 3 Star
                    //4th -> 4 Star
                    System.out.print("*");
                }
            }
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
            System.out.println();
            }
        }
    public static void main(String[] args) {

        int width = 8;
        Dia(width);
    }
}
