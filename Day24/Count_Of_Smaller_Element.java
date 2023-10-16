package Day24;
/*
 Given an sorted array A of size N. Find number of elements which are less than or equal to given element X.

Example 1:
Input:
N = 6
A[] = {1, 2, 4, 5, 8, 10}
X = 9
Output:
5
 */
public class Count_Of_Smaller_Element {
    public static void main(String[] args) {
        long arr[]={1,2,4,5,8,10};
        long X=9;
        System.out.println(countOfElements(arr, arr.length, X));

    }
    public static long countOfElements(long arr[], long n, long x)
    {
        long ans=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=x){
                ans++;
            }
        }
        return ans;
        
    }
}
