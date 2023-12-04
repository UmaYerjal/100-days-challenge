package Day73;
/*
 You are given a string num representing a large integer. An integer is good if it meets the following conditions:

It is a substring of num with length 3.
It consists of only one unique digit.
Return the maximum good integer as a string or an empty string "" if no such integer exists.

Note:

A substring is a contiguous sequence of characters within a string.
There may be leading zeroes in num or a good integer.
 

Example 1:

Input: num = "6777133339"
Output: "777"
Explanation: There are two distinct good integers: "777" and "333".
"777" is the largest, so we return "777".
Example 2:

Input: num = "2300019"
Output: "000"
Explanation: "000" is the only good integer.
Example 3:

Input: num = "42352338"
Output: ""
Explanation: No substring of length 3 consists of only one unique digit. Therefore, there are no good integers.
 */
public class Largest_3Same_Digit_Number_In_String {
    public static void main(String[] args) {
        String str = "3200014888";
        System.out.println(largestGoodInteger(str));
    }
    public static String largestGoodInteger(String num) {
        String str = "";
        int k=0;
        int number =0;
        String sub="";
        for(int i=0;i<num.length()-2;i++){
            if(num.charAt(i)==num.charAt(i+1)){
                if(num.charAt(i+1) == num.charAt(i+2)){
                    if(num.substring(i,i+3).equals("000") && k==0){
                        sub+=num.substring(i,i+3);
                        k++;
                    }
                    int n = Integer.valueOf(num.substring(i,i+3));
                    
                    number = Math.max(number,n);
                }
            }
        }

        if(sub.equals("000")){
            int n = Integer.valueOf(sub);
            if(number>n){
                str+=Integer.toString(number);
            }
            else{
                str+=sub;
            }
        }else{
            if(number!=0){
            str+=Integer.toString(number);
            }
        }

        

        

        return str;

    }
}
