// An array is monotonic if it is either monotone increasing or monotone decreasing.
/**
Input: nums = [1,2,2,3]
Output: true

Input: nums = [6,5,4,4]
Output: true

Input: nums = [1,3,2]
Output: false

 */
public class MonotonicArray {
    public static void main(String[] args) {
        int nums[]={1,3,2};
        int ace =0;
        int dec =0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]<=nums[i+1]){
                ace += 1;
            }
            if(nums[i]>=nums[i+1]){
                dec+=1;
            }
        }
        System.out.print(ace+" "+dec);
        if(ace==n-1 || dec==n-1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    
}