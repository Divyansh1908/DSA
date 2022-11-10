//Leetcode - 2114
public class maxWordInSentence {
    public static int mostWordsFound(String[] sentences) {
        int max=0;
        for( int i=0; i<sentences.length; i++) {
            //Ternary Operator to check if the number of words is greater than max, then assign max to the number of words else keep it max
            max = (sentences[i].split(" ").length > max) ? (sentences[i].split(" ").length) : max;
        }
        return max;
    }
    public static void main(String[] args) {
        String sentences[] = {"please wait","continue to fight","continue to win"};
        int a = mostWordsFound(sentences);
        System.out.println(a);
    }
}
