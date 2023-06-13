package BackTrack;

public class permutation {
    public static void perm(String word, String ans)
    {
        //base case
        if(word.length()==0)
        {
            System.out.println(ans);
        }
        //recursion
        for(int i=0; i<word.length(); i++)
        {
            char a = word.charAt(i);
            //substring the remaining string
            String newStr =  word.substring(0,i)+word.substring(i+1);
            perm(newStr, ans+a);
            //the moment the word get out of here the i gets updated and now a new branch of the tree starts being formed
        }
    }
    public static void main(String[] args) {
        String word = "abc";
        String ans ="";
        perm(word, ans);
    }
}
