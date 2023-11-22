package Day61;
/*
Given a matrix(2D array) M of size N*N consisting of 0s and 1s only. The task is to find the column with maximum number of 0s. If more than one column exists, print the one which comes first. If the maximum number of 0s is 0 then return -1.

Example:

Input:
N = 3
M[][] = {{0, 0, 0},
          {1, 0, 1},
          {0, 1, 1}}
Output:
0
Explanation:
0th column (0-based indexing) is having 2 zeros which is maximum among all columns and comes first.
 */
public class Predict_The_Column {
    public static void main(String[] args) {
        int arr[][] = {{1, 1, 1, 0, 0, 0, 1, 1},
                        {0, 1, 0, 0, 0, 0, 1, 1},
                        {1, 1, 0, 0, 1, 1, 0, 0},
                        {1, 0, 0, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 0, 0, 1},
                        {1, 1, 0, 0, 0, 0, 1, 1},
                        {1, 1, 0, 1, 0, 1, 1, 1},
                        {1, 1, 1, 1, 1, 0, 0, 0}};
        System.out.println(columnWithMaxZeros(arr, arr.length));
    }
    static int columnWithMaxZeros(int arr[][], int N)
    {
        // code here 
        int num =0;
        int idx=-1;
        for(int i=0;i<N;i++){
            int count =0;
            for(int j=0;j<N;j++){
                if(arr[j][i]==0){
                    count++;
                }
            }
            if(count>num){
                num = count ;
                idx = i;
            }
        }
        return idx;
    }
}
