package Day13;
/*
Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).

Example 1:
Input:
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
Explanation: Only Arr[2] = 2 exists here.

Example 2:
Input: 
N = 1
Arr[] = {1}
Output: 1
Explanation: Here Arr[1] = 1 exists.
 */

import java.util.ArrayList;

public class ValueEqualtoIndexValue {
    static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==i+1){
                nums.add(arr[i]);
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[] = {15,2,45,12,4};
        int n = arr.length;
        System.out.println(valueEqualToIndex(arr,n));
    }
}
