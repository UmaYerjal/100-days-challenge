package Day16;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=153;
        int ori=n;
        int sum =0;
        while(n!=0){
            int rem = n%10;
            sum +=(rem*rem*rem);
            n=n/10;
        }
        if(ori==sum){
            System.out.println("Number is Armstrong");
        }else{
            System.out.println("Number is Not Armstrong");
        }
    }
}
