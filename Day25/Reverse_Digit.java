package Day25;
/*
Given N,  reverse the digits of N.
 
Example 1:
Input: 200
Output: 2
Explanation: By reversing the digts of 
number, number will change into 2.

Example 2:
Input : 122
Output: 221
Explanation: By reversing the digits of 
number, number will change into 221.
 */
public class Reverse_Digit {
    public static void main(String[] args) {
        long n = 122;
        System.out.println(reverse_digit(n));
    }
    public static long reverse_digit(long n)
    {
        // Code here
        long sum =0;
        while(n !=0){
            long rem = n%10;
            sum = sum*10+rem;
            n=n/10;
        }
        return sum;
        
    }
}
