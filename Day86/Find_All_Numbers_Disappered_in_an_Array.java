package Day86;

import java.util.ArrayList;
import java.util.List;

/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
 */
public class Find_All_Numbers_Disappered_in_an_Array {
    public static void main(String[] args) {
        int num[] = {4,3,2,7,8,2,3,1};
        List<Integer> arr = findDisappearedNumbers(num);

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();

        int ans[] = new int[nums.length];

        for(int i=0;i<ans.length;i++){
            ans[nums[i]-1]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(ans[i]==0){
                arr.add(i+1);
            }
        }
        return arr;
    }
}
