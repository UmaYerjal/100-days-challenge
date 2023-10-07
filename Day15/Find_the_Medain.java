package Day15;

import java.util.Arrays;

/*
Example 1:

Input: N = 5
arr[] = 90 100 78 89 67
Output: 89
Explanation: After sorting the array 
middle element is the median 

Example 2:

Input: N = 4
arr[] = 56 67 30 79
Output: 61
Explanation: In case of even number of 
elements, average of two middle elements 
is the median.

 */
public class Find_the_Medain {
    public static void main(String[] args) {
        int arr[] = {90, 100, 78,89,67};
        System.out.println(find_median(arr));
    }
    public static int find_median(int[] v)
    {
        // Code here
        Arrays.sort(v);
        int meadin = v.length/2;
        if(v.length %2==0){
            int sum = v[meadin]+v[meadin-1];
            return sum/2;
        }
        return v[meadin];
    }
}
