package Day42;

import java.util.Arrays;

/*
Given an array arr[] of n integers. Check whether it contains a triplet that sums up to zero. 

Note: Return 1, if there is at least one triplet following the condition else return 0.

Example 1:

Input: n = 5, arr[] = {0, -1, 2, -3, 1}
Output: 1
Explanation: 0, -1 and 1 forms a triplet
with sum equal to 0.
Example 2:

Input: n = 3, arr[] = {1, 2, 3}
Output: 0
Explanation: No triplet with zero sum exists. 
 */
public class Find_Triplet_With_Zero_Sum {
    public static void main(String[] args) {
        int arr[] = {0,-1,2,-3,1};
        int n = arr.length;
        System.out.println(findTriplets(arr, n));
    }
    public static boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            int j=i+1;
            int k = arr.length-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum==0)
                    return true;
                else if(sum < 0)
                    j++;
                else
                    k--;
                }
            }
            return false;
    }
}
