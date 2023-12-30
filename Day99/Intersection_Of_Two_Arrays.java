package Day99;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Intersection_Of_Two_Arrays
 */
public class Intersection_Of_Two_Arrays {
    public static void main(String[] args) {
        int nums1[] ={1,2,2,1};
        int nums2[]={2,2};
        int ans[] = intersection(nums1, nums2);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                if(!arr.contains(nums1[i])){
                    arr.add(nums1[i]); 
                }
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int ans[] = new int[arr.size()];
        for(int k=0;k<arr.size();k++){
            ans[k]=arr.get(k);
        }
        return ans;
    }
    
}