// Input: n = 234
// Output: 15 
// Explanation: 
// Product of digits = 2 * 3 * 4 = 24 
// Sum of digits = 2 + 3 + 4 = 9 
// Result = 24 - 9 = 15

public class SubtracttheProductandSubofDigitsofanInteger {
    public static void main(String[] args) {
        int n=894;
        int mul=1,sum=0;
        while(n>0){
            int rem = n%10;
            mul *=rem;
            sum +=rem;
            n=n/10;
        }
        System.out.println(mul-sum);
    }
}
