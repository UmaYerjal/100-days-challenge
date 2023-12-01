package Day70;
/*
 Given a non-negative integer num, return true if num can be expressed as the sum of any non-negative integer and its reverse, or false otherwise.

 

Example 1:

Input: num = 443
Output: true
Explanation: 172 + 271 = 443 so we return true.
Example 2:

Input: num = 63
Output: false
Explanation: 63 cannot be expressed as the sum of a non-negative integer and its reverse so we return false.
Example 3:

Input: num = 181
Output: true
Explanation: 140 + 041 = 181 so we return true. Note that when a number is reversed, there may be leading zeros.
 */
public class Sum_Of_Number_And_Its_Reverse {
    public static void main(String[] args) {
        int num = 443;
        System.out.println(sumOfNumberAndReverse(num)); 
    }
    public static int sumOfNumberAndReverse(int num) {
        if(num==0){
            return num;
        }
        for(int i=1;i<num;i++){
            int sum = i+reverse(i);
            if(sum==num){
                return i;
            }
        }
        return -1;
    }
    public static int reverse(int n ){
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rem+(rev*10);
            n=n/10;
        }
        return rev;
    }
}
