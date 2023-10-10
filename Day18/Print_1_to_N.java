package Day18;

public class Print_1_to_N {
    public static void main(String[] args) {
        int n=10;
        printNos(n);
    }
    public static void printNos(int N)
    {
        if(N==0){
            return ;
        }
        printNos(N-1);
        System.out.print(N+" ");
    }
}
