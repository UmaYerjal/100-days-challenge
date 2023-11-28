package Day66;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * You are given a 0-indexed integer array nums and a target element target.

A target index is an index i such that nums[i] == target.

Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.

 

Example 1:

Input: nums = [1,2,5,2,3], target = 2
Output: [1,2]
Explanation: After sorting, nums is [1,2,2,3,5].
The indices where nums[i] == 2 are 1 and 2.
Example 2:

Input: nums = [1,2,5,2,3], target = 3
Output: [3]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 3 is 3.
 */

public class Find_Target_Index_After_Sorting_Array {
    public static void main(String[] args) {
        int nums[] = {1,2,5,2,3};
        int target = 2;

        List<Integer> arr = targetIndices(nums, target);

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+ " ");
        }
        }
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> arr = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                arr.add(i);
            }
        }
        return arr;
    }
}
