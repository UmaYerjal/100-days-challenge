package Day29;

public class Print_1To_N_Without_Using_Loops {
    public static void main(String[] args) {
       printTillN(5); 
    }
    static void printTillN(int N){
            // code here
            if(N==0){
                return ;
            }
            printTillN(N-1);
            System.out.print(N+" ");
        }
}
