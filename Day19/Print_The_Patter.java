/*
ou are given a number N. You need to print the pattern for the given value of N.

For N = 2 the pattern will be 
2 2 1 1
2 1

For N = 3 the pattern will be 
3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1


 */
public class Print_The_Patter {
    public static void printPat(int n)
    {
        int k=n;
        while(k>0){
            int nums=n;
           for(int i=1;i<=n;i++){
             for(int j=1;j<=k;j++){
                 System.out.print(nums+" ");
             }
             nums--;
         }
          System.out.println();
          k--;
        }
         
         
    }
    public static void main(String[] args) {
        int n=3;
        printPat(n);
    }
}
