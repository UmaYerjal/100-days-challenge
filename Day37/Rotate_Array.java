package Day37;

public class Rotate_Array {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k=3;
        rotate(nums, k);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void rotate(int[] nums, int k) {
        // for(int i=0;i<k;i++){
        //     int last = nums[nums.length-1];
        //     for(int j=nums.length-1;j>0;j--){
        //         nums[j] = nums[j-1];
        //     }
        //     nums[0] = last;
        // }
        
        int n = nums.length;
        int temp[] = new int[n];

        for(int i=0;i<n;i++){
            temp[(i+k)%n] = nums[i];
            
        }
        for(int i=0;i<n;i++){
            nums[i] = temp[i];
        }

    }

}
