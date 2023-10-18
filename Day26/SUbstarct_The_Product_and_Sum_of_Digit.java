package Day26;
/*
Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 
Example 1:
Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15
 */
public class SUbstarct_The_Product_and_Sum_of_Digit {
    public static void main(String[] args) {
      int n = 234;
      System.out.println(subtractProductAndSum(n));  
    }
    public static int subtractProductAndSum(int n) {
        int mul = 1,sum=0;
        while(n>0){
            int rem=n%10;
            mul = mul*rem;
            sum = sum+rem;
            n=n/10;
        }
        return mul-sum;
    }
}
