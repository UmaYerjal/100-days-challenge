package Day80;

import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 */
public class Valid_Parentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> str = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if( ch=='(' || ch == '[' || ch=='{'){
                str.push(ch);
            }else{
                if(!str.isEmpty() && ((str.peek()=='('&& ch==')') ||
                    (str.peek()=='{'&& ch=='}')||
                    (str.peek()=='['&& ch==']'))){
                        str.pop();
                }
                else{
                    return false;
                }
            }
        }  
        if(str.isEmpty()) return true;
        return false;       
    }
}
