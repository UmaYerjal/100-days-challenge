/*
Input: s = "the sky is blue"
Output: "blue is sky the"

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
import java.util.Arrays;
import java.util.Collections;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "  hello world  ";
        String str[] = s.trim().split(" +");
        Collections.reverse(Arrays.asList(str));
        System.out.println(str);
    }
    
    
}
