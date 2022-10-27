public class palindromicPattern {
    public static void palindrome(int width)
    {
        for(int i=1; i<=width; i++) // Traversing each row
        {
            // int a = 1;
            for(int j = width; j>1; j--) //Printing the inverted rotated half pyramid with nothing on top (using j>1 and not j>0)
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
                    //1st ->  
                    //2nd -> 2 Star
                    //3rd -> 3 Star
                    //4th -> 4 Star
                    System.out.print(j);
                }
            }
            for(int k = 0; k<width; k++) //Printing regular pyramid on the right
            {
                if(k<i) 
                {
                    //if the value of k is less than i then print a star
                    //1st row - 0 < 1 = 0 -> 1 star 
                    //2nd row - 0 < 2 = 1 -> 2 star
                    //3rd row - 0 < 3 = 2 -> 3 star
                    //4th row - 0 < 4 = 3 -> 4 star
                    System.out.print(k+1);

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
        int breadth = 5;
        palindrome(breadth);
    }
}
