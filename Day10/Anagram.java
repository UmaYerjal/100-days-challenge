package Day10;
/*
Input:a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have same characters with
same frequency. So, both are anagrams.

Input:a = allergy, b = allergic
Output: NO
Explanation: Characters in both the strings are 
not same, so they are not anagrams.
 */

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a ="uma";
        String b ="mua";

        if(isAnagram(a,b)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
     public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        if(a.length() != b.length()){
            return false;
        }
        
        char ch1[] = a.toCharArray();
        char ch2[] = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        for(int i=0;i<ch1.length;i++){
            if(ch1[i] != ch2[i]){
                return false;
            }
        }
        return true;
    }
}
