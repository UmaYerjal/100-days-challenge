package Day31;

/*
Given a number N.Find if the digit sum(or sum of digits) of N is a Palindrome number or not.
Note:A Palindrome number is a number which stays the same when reversed.Example- 121,131,7 etc.

Example 1:

Input:
N=56
Output:
1
Explanation:
The digit sum of 56 is 5+6=11.
Since, 11 is a palindrome number.Thus,
answer is 1.
 */

public class Sum_Of_Digit_Is_Palindrome_or_Not {
    public static void main(String[] args) {
        int N = 56;
        int sum =0;
        while(N>0){
            int rem = N % 10;
            sum = sum+rem;
            N = N/10;
        }
        
        int org = sum;
        int ans =0;
        while(sum > 0){
            int rem = sum %10;
            ans = rem +(ans*10);
            sum = sum /10;
        }
        
        if(org == ans){
            System.out.println("Number is palindrome");;
        }else{
            System.out.println("Number is Not Palindrome");
        }
        
        
    }
}
