package Day36;
/*
Given a string S consisting only '0's and '1's,  find the last index of the '1' present in it.

Example 1:

Input:
S = 00001
Output:
4
Explanation:
Last index of  1 in given string is 4.
 */
public class Index_Of_One {
    public static void main(String[] args) {
        String str = "0001";
        System.out.println(lastIndex(str));
    }
    public static int lastIndex( String s) {
        int indx=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                indx=i;
            }
        }
        return indx;
        
    }
}
