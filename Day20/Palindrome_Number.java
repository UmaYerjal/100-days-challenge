package Day20;

public class Palindrome_Number {
    public static void main(String[] args) {
        int n=555;
        System.out.println(is_palindrome(n));

    }
    public static String is_palindrome(int n)
    {
        // Code here
        int sum =0;
        int ori=n;
        while(n !=0){
            int rem =n%10;
            sum = rem+(sum*10);
            n=n/10;
        }
        if(ori==sum){
            return "Yes";
        }
        return "No";
    }
}
