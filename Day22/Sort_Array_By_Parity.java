package Day22;

import java.util.ArrayList;

/*
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.

Example 1:
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

Example 2:
Input: nums = [0]
Output: [0]
 */
public class Sort_Array_By_Parity {
    public static void main(String[] args) {
        int arr[] = {3,1,2,4};
        int ans[] = sortArrayByParity(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr1.add(nums[i]);
            }else{
                arr2.add(nums[i]);
            }
        }
        for(int i=0;i<arr1.size();i++){
            nums[i]=arr1.get(i);
        }
        int j=0;
        for(int i=arr1.size();i<nums.length;i++){
            nums[i]=arr2.get(j);
            j++;
        }
        return nums;
    }
}
