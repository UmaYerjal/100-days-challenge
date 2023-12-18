package Day86;

import java.util.ArrayList;
import java.util.List;

/*
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:

Input: nums = [1,1,2]
Output: [1]
Example 3:

Input: nums = [1]
Output: []
 */
public class Find_All_Duplicates_in_an_Array {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDuplicates(arr);

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int arr[] = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]-1]==0){
                arr[nums[i]-1]=nums[i];
            }else{
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}
