package Day23;
/*
Given a number N. Count the number of digits in N which evenly divides N.

Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.
 

Example 1:

Input:
N = 12
Output:
2
Explanation:
1, 2 both divide 12 evenly
Example 2:

Input:
N = 23
Output
0
Explanation:
2 and 3, none of them
divide 23 evenly
 */
public class Count_Digit {
    public static void main(String[] args) {
        int n=12;
        System.out.println(evenlyDivides(n));

    }
    static int evenlyDivides(int N){
        // code here
        int num=N;
        int c=0;
        while(num != 0){
            int rem = num%10;
            if(rem!=0){
                if(N%rem==0){
                c++;
                }
            }
            num/=10;
        }
        return c;
    }
}
