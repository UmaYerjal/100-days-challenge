package Day31;
/*
Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
 

Example 1:

Input: nums = [3,4,5,2]
Output: 12 
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
 */
public class Maximum_Product_Of_Two_Element_in_Array {
    public static void main(String[] args) {
        int nums[] = {3,4,5,2};
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int pro = ((nums[i]-1) * (nums[j]-1));
                ans = Math.max(pro,ans);
            }
        }
        System.out.println(ans);
    }
}
