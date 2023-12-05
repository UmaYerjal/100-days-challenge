package Day74;

import java.util.Arrays;

/*
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */
public class Contains_Duplicate_II {
    public static void main(String[] args) {
        int arr[]= {1,0,1,1,1};
        int k=1;
        System.out.println(containsNearbyDuplicate(arr, k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                 int n=Math.abs(i-j);
                 if(nums[i] != nums[j]){
                     continue;
                 }
                 if(nums[i]==nums[j] &&  n<=k){
                     return true;
                 }
             }
         }
         return false;
    }
}
