package Day83;

/*
write a program to count the number of 1's in the binary representation of an integer

input: 9

output :
2

Explaination 
binary representation of 9 is 1001
count 1's in give binary number of given number i.e 9

 */
public class Set_Bits {
    public static void main(String[] args) {
       int n=9;
       System.out.println(countSetBits(n)); 
    }
    public static int countSetBits(int n) {
		// Write your code here.
		int c=0;
		while(n!=0){
			int rem = n%2;
			if(rem==1){
				c++;
			}
			n=n/2;
		}
		return c;
	}
}
