package Day15;
/*
Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.

 */

public class Length_Of_Last_Word {
    public static void main(String[] args) {
        String s="   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        s.trim();
        String str[] = s.split(" ");
        int len = str[str.length-1].length();
        return len;
    }
}
