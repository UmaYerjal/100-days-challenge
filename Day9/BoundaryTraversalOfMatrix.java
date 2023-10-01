package Day9;

import java.util.ArrayList;

public class BoundaryTraversalOfMatrix {
    public static void main(String[] args) {
        int matrix[][] ={{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15,16}};

        int n=4,m=4;
        ArrayList<Integer> arr = new ArrayList<>();
        
        int startCol = 0;
        int endCol = m-1;
        int startRow = 0;
        int endRow = n-1;
        
        
        if(n==1){
            for(int i=0;i<m;i++){
                arr.add(matrix[0][i]);
            }
            System.out.println(arr);
        }
        if(m==1){
            for(int i=0;i<n;i++){
                arr.add(matrix[i][0]);
            }
            System.out.println(arr);
        }
            // TOp 
            for(int i=startCol;i<=endCol;i++){
                arr.add(matrix[startRow][i]);
            }
            // Right
            for(int i=startRow+1;i<=endRow;i++){
                arr.add(matrix[i][endCol]);
            }
            
            // Bottom 
            for(int i=endCol-1;i>=startCol;i--){
                arr.add(matrix[endRow][i]);
            }
            
            // Left 
            for(int i=endRow-1;i>startRow;i--){
                arr.add(matrix[i][startCol]);
            }
        System.out.println(arr);
    }
}
