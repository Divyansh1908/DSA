public class numberToString {
    static String[]  arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void convo(int n)
    {
        if(n==0)
        {
            return;
        }
        
        int numb = n%10;
        convo(n/10);
        // Write print below the recursion statement to get the correct order
        System.out.println(arr[numb]+" ");
    }
    public static void main(String[] args) {
        convo(2019);
    }
}
