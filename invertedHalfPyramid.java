public class invertedHalfPyramid {
    public static void inver(int breadth)
    {
        //Takes Breadth of the whole pattern required
        for(int i=0; i<breadth; i++) //This loop starts from 0 to 4 in this case
        {
            for(int j=1; j<=breadth;j++) //This loop starts from 1 to 5 in this case
            {
                if(j<=breadth-i) 
                {   //If the value of J is between 1 and breadth-1 then print number
                    //Example for 1st row - It will Print from 1 to 5-0 because at this time i will be 0
                    //2nd row - It will Print from 1 to 5-1 because at this time i will be 1
                    //3rd row - It will Print from 1 to 5-2 because at this time i will be 2
                    // .... 
                    System.out.print(j);
                }
                else{
                    //If it not falls in the range then print - or space
                    System.out.print("-");
                }
                //Ending each row
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int breadth = 5;
        inver(breadth);
    }
}
