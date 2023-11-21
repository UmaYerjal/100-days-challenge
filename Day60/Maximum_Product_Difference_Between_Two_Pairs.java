package Day60;

import java.util.Arrays;

public class Maximum_Product_Difference_Between_Two_Pairs {
    public static void main(String[] args) {
        int nums[] = {5,6,2,7,4};
        System.out.println(maxProductDifference(nums));
    }
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int prod1= nums[n-1]*nums[n-2];
        int prod2 =nums[0]*nums[1];
        return prod1-prod2; 
    }
}
