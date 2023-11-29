
public class Power_Of_Three {
    public static void main(String[] args) {
        int n= 27;
        System.out.println(isPower_of_Three(n));
    }
    public boolean isPowerOfThree(int n) {
        return isPower_of_Three(n);
    }
    public static boolean isPower_of_Three(long n)
    {
        if (n <= 0)
            return false;
        if (n % 3 == 0)
            return isPower_of_Three(n / 3);
        if (n == 1)
            return true;
        return false;
    }
}
