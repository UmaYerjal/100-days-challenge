
package Day66;

/**
 Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.

 

Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
Example 2:

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
 */
public class Check_Two_String_Arrays_Are_Equivalent {

    public static void main(String[] args) {
        String word1[] = {"Uma","Yerjal"};
        String word2[] = {"UmaYerjal"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";
        for(int i=0;i<word1.length;i++){
            str1+=word1[i];
        }
        for(int i=0;i<word2.length;i++){
            str2+=word2[i];
        }
        if(str1.equals(str2)){
            return true;
        }else{
            return false;
        }
    }
}