package Day27;

import java.util.Arrays;

/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
 */
public class Missing_Number {
    public static void main(String[] args) {
       int nums[] = {3,0,1};
       System.out.println(missingNumber(nums)); 
    }
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        for(i=0;i<nums.length;i++){
            if(i != nums[i]){
                return i;
            }
        }
        if(i+1 !=nums.length){
            return i;
        }

        return -1;
    }

}
