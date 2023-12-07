package Day76;

import java.util.ArrayList;
import java.util.List;

/*
Given three integer arrays nums1, nums2, and nums3, return a distinct array containing all the values that are present in at least two out of the three arrays. You may return the values in any order.
 

Example 1:

Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
Output: [3,2]
Explanation: The values that are present in at least two arrays are:
- 3, in all three arrays.
- 2, in nums1 and nums2.
Example 2:

Input: nums1 = [3,1], nums2 = [2,3], nums3 = [1,2]
Output: [2,3,1]
Explanation: The values that are present in at least two arrays are:
- 2, in nums2 and nums3.
- 3, in nums1 and nums2.
 */
public class Two_Out_Of_three {
    public static void main(String[] args) {
        int nums1[] = {1,1,3,2};
        int nums2[] = {2,3};
        int nums3[] = {3};

        List<Integer> arr = twoOutOfThree(nums1, nums2, nums3);

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> arr = new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    if(!(arr.contains(nums1[i]))){
                        arr.add(nums1[i]);
                    }
                }
            }
        }

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums3.length;j++){
                if(nums1[i] == nums3[j]){
                    if(!(arr.contains(nums1[i]))){
                        arr.add(nums1[i]);
                    }
                }
            }
        }

        for(int i=0;i<nums2.length;i++){
            for(int j=0;j<nums3.length;j++){
                if(nums2[i] == nums3[j]){
                    if(!(arr.contains(nums2[i]))){
                        arr.add(nums2[i]);
                    }
                }
            }
        }

        return arr;
    }
}
