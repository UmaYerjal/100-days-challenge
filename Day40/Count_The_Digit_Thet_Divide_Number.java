package Day40;
/*
Given an integer num, return the number of digits in num that divide num.

An integer val divides nums if nums % val == 0.

 

Example 1:

Input: num = 7
Output: 1
Explanation: 7 divides itself, hence the answer is 1.
Example 2:

Input: num = 121
Output: 2
Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
 */
public class Count_The_Digit_Thet_Divide_Number {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(countDigits(num));
    }
    public static int countDigits(int num) {
        int org = num;
        int c=0;
        while(num>0){
            int rem = num%10;
            if(org%rem==0){
                c++;
            }
            num = num/10;
        }
        return c;
    }
}
