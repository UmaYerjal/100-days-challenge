package Day85;

import java.util.Arrays;

/*
 Given an integer array nums, return the number of elements that have both a strictly smaller and a strictly greater element appear in nums.

 

Example 1:

Input: nums = [11,7,2,15]
Output: 2
Explanation: The element 7 has the element 2 strictly smaller than it and the element 11 strictly greater than it.
Element 11 has element 7 strictly smaller than it and element 15 strictly greater than it.
In total there are 2 elements having both a strictly smaller and a strictly greater element appear in nums.
Example 2:

Input: nums = [-3,3,3,90]
Output: 2
Explanation: The element 3 has the element -3 strictly smaller than it and the element 90 strictly greater than it.
Since there are two elements with the value 3, in total there are 2 elements having both a strictly smaller and a strictly greater element appear in nums.
 */
public class Count_Element_With_Stricktly_Smaller_and_Greater_Elements {
    public static void main(String[] args) {
        int num[]= {-3,3,3,9};
        System.out.println(countElements(num));
    }
    public static int countElements(int[] nums) {
        int count =0;
        Arrays.sort(nums);
        int l = nums[0];
        int r = nums[nums.length-1];
        for(int i=1 ; i< nums.length -1 ; i++){
          if(nums[i] >l && nums[i]<r){
              count++;
          }
        }
        return count;

    }
    
}
