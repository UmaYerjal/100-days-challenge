package Day41;
/*
Given a positive integer num, return true if num is a perfect square or false otherwise.

A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

You must not use any built-in library function, such as sqrt.

 

Example 1:

Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
 */
public class Valid_Perfect_Square {
    public static void main(String[] args) {
        int num=16;
        System.out.println(isPerfectSquare(num));
    }
public static boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        for(int i=1;i<=num/2;i++){
            if(i*i==num){
                return true;
            }
            if(i*i>num){
                return false;
            }
        }
        return false;
    }
}
