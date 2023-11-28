package Day67;

import java.util.ArrayList;
import java.util.List;

/*
You are given a 0-indexed array of strings words and a character x.

Return an array of indices representing the words that contain the character x.

Note that the returned array may be in any order.

 

Example 1:

Input: words = ["leet","code"], x = "e"
Output: [0,1]
Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
Example 2:

Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
Output: [0,2]
Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.
 */
public class Find_Words_Containing_Character {
    public static void main(String[] args) {
        String nums[] ={"Uma","yerjal"};
        char target = 'a';
        List<Integer> arr = findWordsContaining(nums, target);

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }


    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> arr = new ArrayList<>();

        for(int i=0;i<words.length;i++){
            String str = words[i];
            int c=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == x && c==0){
                    c=1;
                    arr.add(i);
                }
            }
        }
        return arr;
    }
}
