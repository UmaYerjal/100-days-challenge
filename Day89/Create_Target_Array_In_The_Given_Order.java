package Day89;
/*
 Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.

 

Example 1:

Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
Example 2:

Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
Output: [0,1,2,3,4]
Explanation:
nums       index     target
1            0        [1]
2            1        [1,2]
3            2        [1,2,3]
4            3        [1,2,3,4]
0            0        [0,1,2,3,4]
Example 3:

Input: nums = [1], index = [0]
Output: [1]
 */
import java.util.ArrayList;

public class Create_Target_Array_In_The_Given_Order {
    public static void main(String[] args) {
        int nuus[] ={1,2,3,4,0};
        int index[] = {0,1,2,3,0};
        int ans[] = createTargetArray(nuus, index);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<index.length;i++){
            arr.add(index[i],nums[i]);
        }
        int ans[] = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}
