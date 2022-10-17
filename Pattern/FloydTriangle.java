public class FloydTriangle {
    public static void floyd(int breadth) 
    {
        //Initialize the value of numbers to be starting from 1
        int x=1;
        for(int i=0; i<breadth; i++) // This loop runs from 0 to breadth-1
        {
            for(int j=0; j<=i; j++) // This loop runs from 0 to i
            {
                //For the 1st run _ i = 0; j will run from 0 to 1 (hence print once)
                //For the 2nd run _ i = 1; j will run from 0 to 2 (hence print twice)
                // .....

                //Print the number
                System.out.print(x+"\t");
                //Update the number
                x++;
            }
            // End this line
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int breadth = 5;
        floyd(breadth);
    }
}
