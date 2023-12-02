package Day71;
/*
 Given an array of integer , print the minimum of the abosolute of all possible pairs of element
 example 
 arr = 3,-6,7,-7,,0
 output: 1
 pair(-7,-6);
 */
public class Minimum_Difference_in_Array {
    public static void main(String[] args) {
        int arr[] = {3,-6,7,-7,0};
        System.out.println(minDiff(arr.length, arr));

    } 
    static int minDiff(int n, int[] arr) {
        // Write your code here.
        int miDiff=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!= j){
                    int diff = arr[i]-arr[j];
                    if(diff >= 0 && diff<=miDiff){
                        miDiff = diff;
                    }
                }
            }
        }
        return miDiff;

    }
}

