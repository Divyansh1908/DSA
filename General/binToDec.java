public class binToDec { //multiply the digit from right to left with 2's powers starting from 0
    public static void bin(int num)
    {
        int power=0;
        double decimal = 0;
        int lastDigit = 0;
        while(num>0)
        {
            lastDigit = num %10;
            decimal = decimal + (lastDigit * Math.pow(2,power));
            num = num/10;
            power++;
        }
        System.out.println(decimal);
    }
    public static void main(String[] args) {
         int num = 1111;
         bin(num);
    }
}
