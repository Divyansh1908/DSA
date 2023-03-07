public class tiling {
    public static int tile(int n)
    { 
        if(n==0 || n==1)
        {
            return 1;
        }
        int totalWay = 0;
        //vertical
        int vert = tile(n-1);
        //horizontal
        int hori = tile(n-2);
        totalWay = hori+vert;
        return totalWay;
    }
    public static void main(String[] args) {
        System.out.println(tile(4));
    }
}
