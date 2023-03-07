public class friendsPairing {
    public static int pair(int n)
    {
        if(n==1||n==2)
            return n;

        // //choice
        // int fnm1 = pair(n-1);

        // //pairs
        // int fnm2 = pair(n-2);
        // int pairWay = (n-1) * fnm2;

        // int totWay = fnm1 + pairWay;
        // return totWay;

        // or

        return pair(n-1) + (n-1) * pair(n-2);
    }
    public static void main(String[] args) {
        System.out.println(3);
    }
}
