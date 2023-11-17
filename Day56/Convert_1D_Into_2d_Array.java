package Day56;

public class Convert_1D_Into_2d_Array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int m =2;
        int n=2;
        int ans[][] = construct2DArray(arr, m, n);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static int[][] construct2DArray(int[] arr2, int m, int n) {
        
        int arr[][] = new int[m][n];
        if(n*m !=arr2.length){
            return new int[0][0];
        }
        int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=arr2[k++];
            }
        }
        return arr;
    }
}
