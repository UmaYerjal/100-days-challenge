package Day20;
/*
Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.
 

Example 1:

Input: n = 5
Output: 10
Explanation: The smallest multiple of both 5 and 2 is 10.
Example 2:

Input: n = 6
Output: 6
Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is a multiple of itself.
 */
public class Smallest_Even_Multiple {
    public static void main(String[] args) {
        int n=5;
        System.out.println(smallestEvenMultiple(n));
    }
    public static int smallestEvenMultiple(int n) {
        int i=1;
        while(n>0){
            if(i%n==0 && i%2==0){
                return i;
            }
            i+=1;
        }
        return 0;
    }
}
