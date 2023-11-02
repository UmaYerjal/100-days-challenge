package Day41;
/*
Given an array A of n positive numbers. The task is to find the first equilibrium point in an array. Equilibrium point in an array is an index (or position) such that the sum of all elements before that index is same as sum of elements after it.

Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists. 

Example 1:

Input: 
n = 5 
A[] = {1,3,5,2,2} 
Output: 
3 
Explanation:  
equilibrium point is at position 3 as sum of elements before it (1+3) = sum of elements after it (2+2). 
 */
public class Equilibrium_Point {
    public static void main(String[] args) {
        long arr[] = {1,3,5,2,2};
        int n = arr.length;
        System.out.println(equilibriumPoint(arr, n));
    }
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int sum = 0;
        int lsum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        for(int i=0;i<n;i++){
            if(sum-arr[i] == lsum){
                return i+1;
            }
            lsum += arr[i];
            sum -= arr[i];
        }
        return -1;
    }
}
