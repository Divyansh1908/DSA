public class decToBin { // Divide the number by 2 and save the remainder; then traverse the remainders in reverse order.
    public static void dec(int num)
    {
        int fin = 0;
        int power = 0;
        while(num>0)
        {
            fin = fin + ((num%2)*(int)Math.pow(10, power)); // Get remainder and put it in the front so that next number comes behind it.
            num = num/2;
            power++;
        }
        System.out.println(fin);
    }
    public static void main(String[] args) {
        int deci = 9;
        dec(deci);
    }
}
