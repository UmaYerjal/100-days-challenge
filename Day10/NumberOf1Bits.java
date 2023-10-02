package Day10;
/*
Input: n = 00000000000000000000000000001011
Output: 3
Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
Example 2:

Input: n = 00000000000000000000000010000000
Output: 1
Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.
 */

public class NumberOf1Bits {
    public static void main(String[] args) {
        int n =00000000000000000000000000001011;
        System.out.println(Integer.bitCount(n));
    }
}
