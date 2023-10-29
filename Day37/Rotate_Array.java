package Day37;
/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
public class Rotate_Array {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k=3;
        rotate(nums, k);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void rotate(int[] nums, int k) {
        // for(int i=0;i<k;i++){
        //     int last = nums[nums.length-1];
        //     for(int j=nums.length-1;j>0;j--){
        //         nums[j] = nums[j-1];
        //     }
        //     nums[0] = last;
        // }
        
        int n = nums.length;
        int temp[] = new int[n];

        for(int i=0;i<n;i++){
            temp[(i+k)%n] = nums[i];
            
        }
        for(int i=0;i<n;i++){
            nums[i] = temp[i];
        }

    }

}
