package Day39;
/*
We have two special characters:

The first character can be represented by one bit 0.
The second character can be represented by two bits (10 or 11).
Given a binary array bits that ends with 0, return true if the last character must be a one-bit character.

 

Example 1:

Input: bits = [1,0,0]
Output: true
Explanation: The only way to decode it is two-bit character and one-bit character.
So the last character is one-bit character.
 */
public class One_Bit_and_Two_Bit_Characters {
    public static void main(String[] args) {
        int arr[]={1,0,0};
        System.out.println(isOneBitCharacter(arr));
    }
    static public boolean isOneBitCharacter(int[] bits) {
        int c=0;
        int n= bits.length;
        if(bits[n-1]==0){
            // System.out.print(bits[n-2]+" "+bits[n-3]);
            for(int i=n-2;i>=0 && bits[i] !=0 ;i--){
                c++;
            }
            // if((bits[n-3] == 1 && bits[n-2]==0) || bits[n-3]==1 && bits[n-2]==1 ){
            //     return true;
            // }
        }
        if(c%2>0) return false;
        return true;
    }
}
