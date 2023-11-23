package Day62;

public class CountOddNumbersInAnIntervals {
    public static void main(String[] args) {
        int low = 3;
        int hogh = 7;
        System.out.println(oddNumberCount(low, hogh));
    }
    public static int oddNumberCount(int low,int high){
        if(low%2==0 && high%2==0)
        {
            return (high-low)/2;
        }
        else
        {
            return (high-low)/2+1;
        }
    }
}
