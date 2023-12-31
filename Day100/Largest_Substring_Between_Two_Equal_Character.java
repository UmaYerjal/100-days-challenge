package Day100;
/*
Given a string s, return the length of the longest substring between two equal characters, excluding the two characters. If there is no such substring return -1.

A substring is a contiguous sequence of characters within a string.

 

Example 1:

Input: s = "aa"
Output: 0
Explanation: The optimal substring here is an empty substring between the two 'a's.
Example 2:

Input: s = "abca"
Output: 2
Explanation: The optimal substring here is "bc".
Example 3:

Input: s = "cbzxy"
Output: -1
Explanation: There are no characters that appear twice in s.
 */
public class Largest_Substring_Between_Two_Equal_Character {
    public static void main(String[] args) {
        String s="abca";
        System.out.println(maxLengthBetweenEqualCharacters(s));
        
    }
    public static int maxLengthBetweenEqualCharacters(String s) {
        int current = s.length()-1;
        for (int i=s.length()-1; i>0;i--){
            for (int j=0; j+i<s.length(); j++){
                if (s.charAt(j) == s.charAt(j+i)) return i-1;
            }
            current--;
        }
        return -1;
    }
}
