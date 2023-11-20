package Day59;
/*
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

For example, "Hello World", "HELLO", "hello world hello world" are all sentences.
Words consist of only uppercase and lowercase English letters. Uppercase and lowercase English letters are considered different.

A sentence is circular if:

The last character of a word is equal to the first character of the next word.
The last character of the last word is equal to the first character of the first word.
For example, "leetcode exercises sound delightful", "eetcode", "leetcode eats soul" are all circular sentences. However, "Leetcode is cool", "happy Leetcode", "Leetcode" and "I like Leetcode" are not circular sentences.

Given a string sentence, return true if it is circular. Otherwise, return false.

 

Example 1:

Input: sentence = "leetcode exercises sound delightful"
Output: true
Explanation: The words in sentence are ["leetcode", "exercises", "sound", "delightful"].
- leetcode's last character is equal to exercises's first character.
- exercises's last character is equal to sound's first character.
- sound's last character is equal to delightful's first character.
- delightful's last character is equal to leetcode's first character.
The sentence is circular.
Example 2:

Input: sentence = "eetcode"
Output: true
Explanation: The words in sentence are ["eetcode"].
- eetcode's last character is equal to eetcode's first character.
The sentence is circular.
Example 3:

Input: sentence = "Leetcode is cool"
Output: false
Explanation: The words in sentence are ["Leetcode", "is", "cool"].
- Leetcode's last character is not equal to is's first character.
The sentence is not circular.
 
 */
public class Circular_Sentence {
    public static void main(String[] args) {
       String str = "leetcode exercises sound delightful";
        System.out.println(isCircularSentence(str));
    }
    public static boolean isCircularSentence(String sentence) {
        
        String str[] = sentence.split(" ");
        if(str.length==1){
            if(sentence.charAt(0) == sentence.charAt(sentence.length()-1)){
                return true;
            }
            else{
                return false;
            }
        }
        boolean flag = true;
        for(int i=0;i<str.length-1;i++){
            String sam = str[i];
            String sam2 = str[i+1];
            if(sam.charAt(sam.length()-1) != sam2.charAt(0)){
                flag = false;
            }
        }
        String sam = str[0];
        String sam2 = str[str.length-1];
        System.out.println(sam2);
        if(sam.charAt(0) !=sam2.charAt(sam2.length()-1)){
            flag=false;
        }
        if(flag==true){
            return true;
        }
        return false;
    }
}
