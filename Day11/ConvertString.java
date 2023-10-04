/*
Input : "i am uma yerjal"
Output : "I Am Uma Yerjal";

input :
why you are confused
Its a good day to be here
go and do your work
Output:
Why You Are Confused
Its A Good Day To Be Here
Go And Do Your Work
 */

public class ConvertString {
    public static String convertString(String str) {
        // Write your code here
        StringBuilder ans = new StringBuilder();
        char ch[] = str.toCharArray();
        ans.append(Character.toUpperCase(ch[0]));
        for(int i=1;i<ch.length;i++){
            if(ch[i] == ' '){
                ans.append(ch[i]);
                ans.append(Character.toUpperCase(ch[i+1]));
                if(ch[i+2] == ' '){
                    ans.append(ch[i]);
                    ans.append(Character.toUpperCase(ch[i+3]));
                    i=i+2;
                }
                    i=i+2;
            }
            ans.append(ch[i]);
        }
    return ans.toString(); 
            
}
public static void main(String[] args) {
    String str = "why you are confused Its a good day to be here go and do your work";
    System.out.println(convertString(str));
}
}
