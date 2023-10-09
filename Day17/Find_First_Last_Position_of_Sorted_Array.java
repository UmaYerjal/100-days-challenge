package Day17;

import java.util.Arrays;

/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]

 */
public class Find_First_Last_Position_of_Sorted_Array {
    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        int target=8;
        int ans[] = searchRange(arr, target);
        for(int i=0;i<2;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        int last=-1;
        int first =-1;
        first=findFirst(nums,target);
        last = findLast(nums,target);
        arr[0]=first;
        arr[1]=last;
        Arrays.sort(arr);
        return arr;
    }
    public static int findFirst(int nums[],int target){
        int start = 0;
        int end = nums.length-1;
        int first =-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                if(mid == 0 || nums[mid - 1] != target){
                    first=mid;
                    break;
                }else{
                    end=mid-1;
                }
            }
            else if(nums[mid]>target){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return first;
    }
    public static int findLast(int nums[],int target){
        int start = 0;
        int end = nums.length-1;
        int last=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                    if(mid == nums.length - 1 || nums[mid + 1] != target){
                        last=mid;
                        break;
                    }else{
                        start=mid+1;
                    }
            }
            else if(nums[mid]>target){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return last;
    }
}
