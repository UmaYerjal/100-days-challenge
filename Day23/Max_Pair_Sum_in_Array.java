package Day23;
/*
You are given a 0-indexed integer array nums. You have to find the maximum sum of a pair of numbers from nums such that the maximum digit in both numbers are equal.

Return the maximum sum or -1 if no such pair exists.

 

Example 1:

Input: nums = [51,71,17,24,42]
Output: 88
Explanation: 
For i = 1 and j = 2, nums[i] and nums[j] have equal maximum digits with a pair sum of 71 + 17 = 88. 
For i = 3 and j = 4, nums[i] and nums[j] have equal maximum digits with a pair sum of 24 + 42 = 66.
It can be shown that there are no other pairs with equal maximum digits, so the answer is 88.
Example 2:

Input: nums = [1,2,3,4]
Output: -1
Explanation: No pair exists in nums with equal maximum digits.
 */
public class Max_Pair_Sum_in_Array {
    public static void main(String[] args) {
        int arr[] = {51,71,17,24,42};
        System.out.println(maxSum(arr));
    }
    public static int maxSum(int[] nums) {
        int max=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                // int num = reverse(nums[j]);
                if(reverse(nums[i])==reverse(nums[j])){
                    int ans = nums[i]+nums[j];
                    max=Math.max(ans,max);
                }
            }
        }
        return max;
    }
    public static int reverse(int n){
        int sum =0;
        while(n!=0){
            int rem = n%10;
            sum=Math.max(rem,sum);
            n=n/10;
        }
        return sum;
    }
}
