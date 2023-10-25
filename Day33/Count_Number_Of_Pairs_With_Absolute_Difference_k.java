package Day33;
/*
Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.

The value of |x| is defined as:

x if x >= 0.
-x if x < 0.
 

Example 1:

Input: nums = [1,2,2,1], k = 1
Output: 4
Explanation: The pairs with an absolute difference of 1 are:
- [1,2,2,1]
- [1,2,2,1]
- [1,2,2,1]
- [1,2,2,1]
 */
public class Count_Number_Of_Pairs_With_Absolute_Difference_k {
    public static void main(String[] args) {
        int nums[] = {1,2,2,1};
        int k=1;
        System.out.println(countKDifference(nums, k));
    }
    public static int countKDifference(int[] nums, int k) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int diff = Math.abs(nums[i]-nums[j]);
                if(diff == k){
                    count++;
                }
            }
        }
        return count;
    }
}
