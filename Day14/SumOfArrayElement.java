package Day14;

public class SumOfArrayElement {
    public static void main(String[] args) {
        int arr[] = {3,2,1};
        int n=arr.length;
        System.out.println(sumElement(arr, n));
    }
    public static int sumElement(int arr[], int n)
    {
        // Your code here
        int sum =0;
        for(int i=0;i<n;i++){
            sum +=arr[i];
        }
        return sum;
    }
}
