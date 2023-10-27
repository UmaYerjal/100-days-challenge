package Day35;
// Given an array arr[] sorted in ascending order of size N and an integer K. Check if K is present in the array or not.


// Example 1:

// Input:
// N = 5, K = 6
// arr[] = {1,2,3,4,6}
// Output: 1
// Exlpanation: Since, 6 is present in 
// the array at index 4 (0-based indexing),
// output is 1.
public class Searching_an_element_in_Sorted_Array {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6};
        int n= arr.length;
        int k=6;
        System.out.println(searchInSorted(arr, n, k));

    }
    static int searchInSorted(int arr[], int N, int K)
    {
        
        // Your code here
        int s=0;
        int e=N-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==K){
                return 1;
            }
            if(arr[mid]<K){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;
        
    }
}
