package Day42;
/*
 Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.
Example 3:

Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Third_Maximum_Number {
    public static void main(String[] args) {
        int num[] = {3,2,1};
        System.out.println(thirdMax(num));
    }
    public static int thirdMax(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
    
        Arrays.sort(nums);
        if(nums.length<3){
            return nums[nums.length-1];
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(!(arr.contains(nums[i]))){
                    arr.add(nums[i]);
                }
            }
        }
        if(arr.size()<3){
            return arr.get(arr.size()-1);
        }
        return arr.get(arr.size()-3);
    }
}
