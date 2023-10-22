public class Sum_Of_Digit {
    public static void main(String[] args) {
        int N=12;
            int sum =0;
            while(N>0){
                int rem = N%10;
                sum+=rem;
                N=N/10;
        }
        System.out.println(sum);
    }
}
