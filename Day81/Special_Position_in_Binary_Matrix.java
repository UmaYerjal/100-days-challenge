package Day81;
/*
Given an m x n binary matrix mat, return the number of special positions in mat.

A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).

 

Example 1:


Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
Output: 1
Explanation: (1, 2) is a special position because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.
Example 2:


Input: mat = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3
Explanation: (0, 0), (1, 1) and (2, 2) are special positions.
 
 */
public class Special_Position_in_Binary_Matrix {
    public static void main(String[] args) {
        int arr[][] = {{1,0,0},{0,1,0},{0,0,1}};
        System.out.println(numSpecial(arr));
    }
    public static int numSpecial(int[][] mat) {
        int result = 0;
        int [] columns = new int [mat[0].length];
        for (int i = 0; i < mat.length; i ++) {
            int ones_in_the_row = 0;
            int column = 0;
            for (int j = 0; j < mat[i].length; j ++) {
                if (mat[i][j] == 1) {
                    ones_in_the_row ++;
                    if (ones_in_the_row == 1) {
                        columns[j] = columns[j] == 0 ? 1 : 2;
                        column = j;
                    }
                    else {
                        columns[column] = 2;
                        columns[j] = 2;
                    }
                }
            }

        }
        for (int column : columns) {
            result += (column == 1 ? 1 : 0);
        }
        return result;
    }
}
