package Day34;
/*
Given a non-negative integer N. The task is to check if N is a power of 2. More formally, check if N can be expressed as 2x for some integer x. Return true if N is power of 2 else return false.

Example 1:

Input: 
N = 8
Output: 
YES
Explanation:
8 is equal to 2 raised to 3 (23 = 8).
 */
public class Pow_Of_Two {
    public static void main(String[] args) {
        long n=8;
        if(isPowerofTwo(n)){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        int i=0;
        while(true){
            double m = Math.pow(2,i);
            if(m==n)return true;
            if(m>n) break;
            i++;
        }
        return false;
        
    }
}
