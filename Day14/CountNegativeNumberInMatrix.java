package Day14;

public class CountNegativeNumberInMatrix {
    public static void main(String[] args) {
        int matrix[][] ={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(matrix));
    }
    public static int countNegatives(int[][] grid) {
        int c=0;
       for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[i].length;j++){
               if(grid[i][j] <0){
                   c++;
               }
           }
       } 
       return c;
    }
}
