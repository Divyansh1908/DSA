// Solid Rhombus
public class solidRhombus {
    public static void rhom(int width)
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
            for(int k = 0; k<width; k++) //To Print 5 stars
            {
                System.out.print("*");
            }      
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int width = 5;
        rhom(width);
    }
}
