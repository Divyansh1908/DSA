public class removeDuplicate {
    public static void removeDupli(String str, int i, StringBuilder newStr, boolean map[])
    {
        if(i == str.length())
        {
            System.out.println(newStr);
            return;
        }
        char curr = str.charAt(i);
        if(map[curr-'a'] == true)
        {
            removeDupli(str, i+1, newStr, map);
        }
        else
        {
            map[curr-'a'] = true;
            removeDupli(str, i+1, newStr.append(curr), map);
        }
    }
    public static void main(String[] args) {
        StringBuilder newStr = new StringBuilder();
        boolean map[] = new boolean[26];
        removeDupli("aaoomileyaara", 0, newStr, map);
    }
}
