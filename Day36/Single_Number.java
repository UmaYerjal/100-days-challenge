package Day36;

import java.util.Arrays;

/*
Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,3,2]
Output: 3
Example 2:

Input: nums = [0,1,0,1,0,1,99]
Output: 99
 */
public class Single_Number {
    public static void main(String[] args) {
        int nums[] = {2,2,3,2,4,3,3};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int num=-1;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                i=i+2;
            }
            else{
                num=nums[i];
                break;
            }
        }
        if(nums[nums.length-2] !=nums[nums.length-1]){
            num=nums[nums.length-1];
        }
        return num;
    }

}
