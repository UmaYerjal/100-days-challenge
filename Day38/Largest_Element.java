package Day38;

public class Largest_Element {
    public static void main(String[] args) {
        int n=5;
        int arr[] = {1,8,7,56,90};
        System.out.println(largest(arr, n));
    }
    public static int largest(int arr[], int n)
    {
        int num =arr[0];
        for(int i=1;i<n;i++){ 
            if(arr[i]>num){
                num = arr[i];
            }
        }
        return num;
    }
}
