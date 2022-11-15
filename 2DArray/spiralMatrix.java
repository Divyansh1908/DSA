public class spiralMatrix {
    public static void spiral(int matrix[][])
    {
        //Initialising 
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol)
        {
            //Top
            for(int i=startCol; i<=endCol; i++)
            {
                System.out.print(matrix[startRow][i]+" ");
            }
            //Right
            for(int j=startRow+1; j<=endRow; j++)
            {
                System.out.print(matrix[j][endCol]+" ");
            }
            //Bottom
            for(int i=endCol-1; i>=startCol; i--)
            {
                //If odd numbers of cols then runs this to avoid printing twice
                if(startCol==endCol)
                {
                    break;
                }
                System.out.print(matrix[endRow][i]+" ");
            }
            //End
            for(int i=endRow-1; i>=startRow+1; i--)
            {
                //If odd numbers of cols then runs this to avoid printing twice
                if(startRow==endRow)
                {
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiral(matrix);
    }
}
