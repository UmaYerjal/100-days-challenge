package Day37;
/*
Given a binary array A[] of size N. The task is to arrange the array in increasing order.
Note: The binary array contains only 0  and 1.
 

Example 1:

Input: 
5
1 0 1 1 0

Output: 
0 0 1 1 1

 */
public class Binary_Array_Sorting {
    public static void main(String[] args) {
        int A[] = {1,0,1,0,1,1,0,0};
        int n = A.length;
        binSort(A, n);
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
    }
    static void binSort(int A[], int N)
    {
        int s=0;
        int e=N-1;
        while(s<e){
            if(A[s] == 1 && A[e] == 0){
                int temp = A[s];
                A[s] = A[e];
                A[e] = temp;
                s++;
                e--;
            }else if(A[s] == 0 && A[s]==0){
                s++;
            }else if(A[s] == 0 && A[s] == 1){
                e--;
            }else if(A[s]==0){
                s++;
            }
            else{
                e--;
            }
        }
    }
}