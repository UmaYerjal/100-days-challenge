package Day13;
/*
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int arr[] ={1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(arr,target));
    }
    public static int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target ){
                return i;
            }
        }
        int n=0;
            for(int i=1;i<nums.length;i++){
                if(nums[i-1]<target && nums[i]>target){
                    n=i;
                    System.out.print(n+" ");
                }
            }
        
        if(target > nums[nums.length-1]){
            n=nums.length;
        }
        // if(nums.length == 2 && nums[0]<target)
        return n;
    }
}
