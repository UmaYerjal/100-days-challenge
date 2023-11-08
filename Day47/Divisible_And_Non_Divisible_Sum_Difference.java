package Day47;

public class Divisible_And_Non_Divisible_Sum_Difference {
    public static void main(String[] args) {
        int n =10;
        int m=3;
        System.out.println(differenceOfSums(n, m));
    }
    public static int differenceOfSums(int n, int m) {
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=n;i++){
            if(i%m !=0){
                sum1+=i;
            }
            if(i%m==0){
                sum2+=i;
            }
        }
        return sum1-sum2;
        
    }
}
