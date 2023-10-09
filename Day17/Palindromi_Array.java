package Day17;
/*
Example 1:

Input:
5
111 222 333 444 555

Output:
1

Explanation:
A[0] = 111 //which is a palindrome number.
A[1] = 222 //which is a palindrome number.
A[2] = 333 //which is a palindrome number.
A[3] = 444 //which is a palindrome number.
A[4] = 555 //which is a palindrome number.
As all numbers are palindrome so This will return 1.

Example 2:
Input:
3
121 131 20
 
Output:
0

Explanation:
20 is not a palindrome hence the output is 0.
 */
public class Palindromi_Array {
    public static void main(String[] args) {
        int arr[] ={11,222,333,555,121};
        System.out.println(palinArray(arr, arr.length));
    }
    public static int palinArray(int[] a, int n)
    {
                  //add code here.
        int num=0;
        for(int i=0;i<n;i++){
            num=findNumber(a[i]);
            if(num==0){
                break;
            }
        }
        return num;
    }
    public static int findNumber(int n){
        int sum =0;
        int orig=n;
        
        while(n!=0){
            int rem = n%10;
            sum =rem+(sum*10);
            n=n/10;
        }
        
        if(orig==sum){
            return 1;
        }else{
            return 0;
        }
        
    }
}
