public class binaryStrings {
    public static void binStr(int n, int lastPl, String str)
    {
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        // //KAAM
        // if(lastPl == 0)
        // {
        //     //0 or 1 can sit on current posi
        //     binStr(n-1, 0, str.append("0"));
        //     binStr(n-1, 1, str.append("1"));
        // }
        // else
        // {
        //     binStr(n-1, 0, str.append("0"))
        // }
        // easier method
        binStr(n-1, 0, str+"0");
        if(lastPl ==0)
        {
            binStr(n-1, 1, str+("1"));
        }

    }
    public static void main(String[] args) {
        binStr(3, 0, "");
    }
}
