package Day38;

import java.util.ArrayList;
import java.util.List;

/*
You are given a 0-indexed integer array nums and an integer k.

Return an integer that denotes the sum of elements in nums whose corresponding indices have exactly k set bits in their binary representation.

The set bits in an integer are the 1's present when it is written in binary.

For example, the binary representation of 21 is 10101, which has 3 set bits.
 

Example 1:

Input: nums = [5,10,1,5,2], k = 1
Output: 13
Explanation: The binary representation of the indices are: 
0 = 0002
1 = 0012
2 = 0102
3 = 0112
4 = 1002 
Indices 1, 2, and 4 have k = 1 set bits in their binary representation.
Hence, the answer is nums[1] + nums[2] + nums[4] = 13.
 */
public class Sum_Of_Values_at_Indices_With_k_Set_Bits {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(10);
        arr.add(1);
        arr.add(5);
        arr.add(2);
        int k=1;
        int ans = sumIndicesWithKSetBits(arr, k);
        System.out.println(ans);
    }
public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int c=0;
        for(int i=0;i<nums.size();i++){
            String str = Integer.toBinaryString(i);
            System.out.print(str+" ");
            int digit =0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='1'){
                    digit++;
                }
            }
            if(digit==k){
                c +=nums.get(i);
            }
        }
        return c;
    }
}
