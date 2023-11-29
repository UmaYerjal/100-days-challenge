
public class Power_Of_Two {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int n=16;
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        for(int i=0;i<=Math.round(Math.sqrt(n));i++){
            if(Math.pow(2,i) == n){
                return true;
            }
        } 
        return false;
    }
}
