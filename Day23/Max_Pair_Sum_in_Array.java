package Day23;

public class Max_Pair_Sum_in_Array {
    public static void main(String[] args) {
        int arr[] = {51,71,17,24,42};
        System.out.println(maxSum(arr));
    }
    public static int maxSum(int[] nums) {
        int max=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                // int num = reverse(nums[j]);
                if(reverse(nums[i])==reverse(nums[j])){
                    int ans = nums[i]+nums[j];
                    max=Math.max(ans,max);
                }
            }
        }
        return max;
    }
    public static int reverse(int n){
        int sum =0;
        while(n!=0){
            int rem = n%10;
            sum=Math.max(rem,sum);
            n=n/10;
        }
        return sum;
    }
}
