package Day78;
/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */
public class Reverse_String {
    public static void main(String[] args) {
        char s[] = {'h','e','l','l','o'};

        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
        System.out.println();
        reverseString(s);
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
    }
    public static void reverseString(char[] s) {
        int start =0;
        int end = s.length-1;

        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
