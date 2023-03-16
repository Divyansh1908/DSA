public class towerOfHanoi {
    public static void tower(int num, String src, String dest, String help)
    {
        if(num==1)
        {
            System.out.println("Transfer disk "+num+" from "+src+" to "+ dest);
            return;
        }
        tower(num-1, src, help, dest);

        System.out.println("Transfer disk "+num+" from "+src+" to "+dest);

        tower(num-1, help, dest, src);

    }
    public static void main(String[] args) {
        int num=3;
        tower(num, "A", "C", "B");
    }
}
