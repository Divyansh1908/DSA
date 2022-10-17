//Traverse each line and for the first and last line print whole lines, for the beech kaa lines print only first and last star
public class HollowRectangle {
    public static void rectangle(int length, int height)
    {
        for(int i=0; i<height ;i++)
        {
            if((i == 0)||(i==(height-1)))
            {
                for(int j=0; j<length; j++)
                {
                    System.out.print("*\t");
                }
            }
            else
            {
                for(int j=0; j<length; j++)
                {
                    if((j==0)||(j==length-1))
                    {
                        System.out.print("*\t");
                    }
                    else
                    {
                        System.out.print("\t");
                    }       
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int height = 9;
        int length = 10;
        rectangle(length, height);
    }
}
