package Day52;
/*
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"

 */

public class Excel_Sheet_Column_Title {
    public static void main(String[] args) {
        int n =701;
        System.out.println(convertToTitle(n));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            char c = (char) ('A'+columnNumber%26);
            // System.out.print(c+" ");
            str.insert(0,c);
            columnNumber /=26;
            
        }
        return str.toString();
    }
}
