/*
Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k] such that i < j < k and nums[i] < nums[k] < nums[j].
Return true if there is a 132 pattern in nums, otherwise, return false.

Input: nums = [1,2,3,4]
Output: false
Explanation: There is no 132 pattern in the sequence.

Input: nums = [3,1,4,2]
Output: true
Explanation: There is a 132 pattern in the sequence: [1, 4, 2].

Input: nums = [-1,3,2,0]
Output: true
Explanation: There are three 132 patterns in the sequence: [-1, 3, 2], [-1, 3, 0] and [-1, 2, 0].
 */
public class Pattern132 {
    public static void main(String[] args) {
        int nums[] = {-1,3,2,0};
        boolean n = false;
        for(int i=0;i<nums.length;i++){
            for(int k=i+1;k<nums.length;k++){
                if(nums[i]>=nums[k]){
                    break;
                }
                for(int j=k+1;j<nums.length;j++){
                    if(nums[k]<=nums[i] || nums[k]<=nums[j]){
                        break;
                    }
                    if(nums[i] < nums[k] && nums[k] > nums[j] && nums[i]<nums[j]){
                        n=true;
                        break;
                    }
                    
                }
                
            }
        }
        System.out.println(n);
    }
    
}
