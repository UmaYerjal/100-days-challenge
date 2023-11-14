package Day53;
/*
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.

 

Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
Explanation: 
- index 0 --> the greatest element to the right of index 0 is index 1 (18).
- index 1 --> the greatest element to the right of index 1 is index 4 (6).
- index 2 --> the greatest element to the right of index 2 is index 4 (6).
- index 3 --> the greatest element to the right of index 3 is index 4 (6).
- index 4 --> the greatest element to the right of index 4 is index 5 (1).
- index 5 --> there are no elements to the right of index 5, so we put -1.
 */
public class Replace_Element_With_Greatest_Element_On_Right_Side {
    public static void main(String[] args) {
        int arr[] = {17,18,5,4,6,1};
        int ans[] = replaceElements(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] replaceElements(int[] arr) {
        int ans[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int max =0;
            for(int j=i+1;j<arr.length;j++){
                max=Math.max(max,arr[j]);
            }
            ans[i] = max;
        }
        ans[ans.length-1] = -1;
        return ans;
    }
}
