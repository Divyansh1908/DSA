public class hollowRhombus {
    public static void hollow(int width)
    {
        for(int i=1; i<=width; i++) //For row 1 to 5, using 1 instead of 0 because we will use it in the following loop to substract
        {
            for(int j = 0; j<width-i; j++) 
            {   //To print spaces
                // 1st row -> 0 to 3 =  4 spaces
                // 2nd row -> 0 to 2 =  3 spaces
                // 3rd row -> 0 to 1 =  2 spaces
                // 4th row -> 0 to 0 =  1 spaces
                // 5th row -> no space
                System.out.print("-");
            } 
            if((i==1)||(i==width)) //  For 1st and last row print all 5 stars
            {
                for(int j=0; j<width; j++)
                {
                    System.out.print("*");
                }
                System.out.println(); // Endline
                continue; // To next ROW after printing whole line
            }       
            for(int k=0; k<width;k++) // Printing stars for 2nd, 3rd and 4th Line
            {
                if((k==0)||(k==width-1)) // First and last place will have a star
                    {
                        System.out.print("*");
                    }
                    else // all other element will have space
                    {
                        System.out.print(" ");
                    }       
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int width = 5;
        hollow(width);
    }
}
