public class findingSubsets {
    public static void subs(String str, String ans, int a)
    {
        //base case
        if(a == str.length())
        {
            if(ans.length() == 0)
            {
                System.out.println("null");
            }
            else
            {
                System.out.println(ans);
            }
            return;
        }
        //recursion
        //Yes Choice
        subs(str, ans+str.charAt(a),a+1);
        //No Choice
        subs(str, ans, a+1);
    }
    public static void main(String[] args) {
        subs("abc", "", 0);
    }
}
