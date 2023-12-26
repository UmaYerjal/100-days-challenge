package Day94;

import java.util.ArrayList;
import java.util.List;

/*
You are given a binary array nums (0-indexed).

We define xi as the number whose binary representation is the subarray nums[0..i] (from most-significant-bit to least-significant-bit).

For example, if nums = [1,0,1], then x0 = 1, x1 = 2, and x2 = 5.
Return an array of booleans answer where answer[i] is true if xi is divisible by 5.

 

Example 1:

Input: nums = [0,1,1]
Output: [true,false,false]
Explanation: The input numbers in binary are 0, 01, 011; which are 0, 1, and 3 in base-10.
Only the first number is divisible by 5, so answer[0] is true.
Example 2:

Input: nums = [1,1,1]
Output: [false,false,false]
 */
public class Binary_Prefix_Divisible_By_Five {
    public static void main(String[] args) {
        int nums[] ={0,1,1};
        List<Boolean> arr=prefixesDivBy5(nums);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
    public static List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();

        int val=0;
        for(int i:nums){
            val=((val*2)+i)%5;
            ans.add(val==0);

        }
        return ans;
    }
}
