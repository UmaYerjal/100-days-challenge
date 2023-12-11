package Day79;

public class Transpose_Matrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                       {4,5,6},
                        {7,8,9} };
        int ans[][] = transpose(arr);

        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int arr[][] = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                arr[i][j] = matrix[j][i];
            }
        }
        return arr;
    }
}
