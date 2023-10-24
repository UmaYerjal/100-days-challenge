package Day32;
/*
You are given a positive integer array nums.

The element sum is the sum of all the elements in nums.
The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
Return the absolute difference between the element sum and digit sum of nums.

Note that the absolute difference between two integers x and y is defined as |x - y|.

 

Example 1:

Input: nums = [1,15,6,3]
Output: 9
Explanation: 
The element sum of nums is 1 + 15 + 6 + 3 = 25.
The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
The absolute difference between the element sum and digit sum is |25 - 16| = 9.
 
*/
public class Differance_Between_Element_Sum_and_Digit_Of_Array {
    public static void main(String[] args) {
        int arr[] ={1,15,6,3};
        System.out.println(differenceOfSum(arr));
    }
    public static int differenceOfSum(int[] nums) {
        int arrSum =0;
        int digitSum =0;

        for(int i=0;i<nums.length;i++){
            arrSum +=nums[i];
            digitSum +=DigitSum(nums[i]);
        }
        return Math.abs(arrSum-digitSum);
    }
    public static int DigitSum(int n){
    int sum =0;
        while(n>0){
            int rem = n%10;
            sum = sum+rem;
            n=n/10;
        }
    return sum;
    }
}
