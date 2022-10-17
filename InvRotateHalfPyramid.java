public class InvRotateHalfPyramid {

    public static void main(String[] args) {

        pyramidPrinter(4);
    }

    public static void pyramidPrinter(int order){

        //code prints a pyramid aligned to the right with a given order.
        //first, we declare a for loop for the vertical order
        //next, we declare a for loop for the horizontal printing
        for(int i=1; i<=order; i++){
            //vertical
            for(int j=order; j>0; j--){
                //horizontal
                //j moves in the reverse direction of i
                if(j>i){
                    //since j starts out from the order (which is always greater than 0)
                    //i will just check whether j is greater than i, and for those many iterations,
                    //i will print a space or \t tab
                    //whenever j reaches or decreases below i, I will print a star
                    //im doing this because if we look at the diagram, the first row should have only 1 star
                    //and the final row should have "order" number of stars
                    //so when 'int i' in my first for loop reaches the order, i do not need any stars
                    //in the final iteration, j will not be greater than i so no spaces will be printed
                    System.out.print("\t");
                }
                else{
                    //if j is the same as i, that is when stars need to be printed instead of spaces
                    System.out.print("\t*");
                }
            }
            System.out.println();
            /*
            first iteration -
            order = 4
            we need 3 spaces and 1 star
            i=1 j=4
            first row,
            4 is greater than 1, so we print a space
            "   "
            i=1 j-- = 3
            first row,
            3 is greater than 1, so we print a space
            "       "
            i=1 j-- = 2
            first row,
            2 is greater than 1, so we print a space
            "           "
            i=1 j-- = 1
            first row,
            1 is not greater than 1, so we print a star
            "               *"
            i=2 j=4
            second row,
            4 is greater than 2, so we print a space
            "               *"
            "   "
            i=2 j-- = 3
            second row,
            3 is greater than 2, so we print a space
            "               *"
            "       "
            i=2 j-- = 2
            second row,
            2 is not greater than 2, so we print a star
            "               *"
            "           *"
            i=2 j-- = 1
            second row,
            1 is not greater than 2, so we print a star
            "               *"
            "           *   *"
            i=3 j=4
            third row,
            4 is greater than 3, so we print a space
            "               *"
            "           *   *"
            "   "
            i=3 j-- = 3
            third row,
            3 is not greater than 3, so we print a star
            "               *"
            "           *   *"
            "       *"
            i=3 j-- = 2
            third row,
            2 is not greater than 3, so we print a star
            "               *"
            "           *   *"
            "       *   *"
            i=3 j-- = 1
            third row,
            1 is not greater than 3, so we print a star
            "               *"
            "           *   *"
            "       *   *   *"
            i=4 j=4
            final/fourth row,
            4 is not greater than 4, so we print a star
            "               *"
            "           *   *"
            "       *   *   *"
            "   *"
            i=4 j-- = 3
            final/fourth row,
            3 is not greater than 4, so we print a star
            "               *"
            "           *   *"
            "       *   *   *"
            "   *   *"
            i=4 j-- = 2
            final/fourth row,
            2 is not greater than 4, so we print a star
            "               *"
            "           *   *"
            "       *   *   *"
            "   *   *   *"
            i=4 j-- = 1
            final/fourth row,
            1 is not greater than 4, so we print a star
            "               *"
            "           *   *"
            "       *   *   *"
            "   *   *   *   *"
            final Sys.out statement to end the program
             */
        }
    }
}