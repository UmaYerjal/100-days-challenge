package Day32;
/*

Given an array, rotate the array by one position in clock-wise direction.
 
Example 1:

Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
 */
public class Cyclically_Rotated_Array_By_One {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        rotate(arr, n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotate(int arr[], int n)
    {
        int ans[] = new int[n];
        
        int k=0;
        for(int i=1;i<n;i++){
            ans[i]=arr[k];
            k++;
        }
        ans[0]=arr[n-1];
        
        for(int i=0;i<n;i++){
            arr[i]=ans[i];
        }
    }
}
