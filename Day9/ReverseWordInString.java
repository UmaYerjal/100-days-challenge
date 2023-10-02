package Day9;

import java.util.ArrayList;

/**
 Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Input: s = "God Ding"
Output: "doG gniD"

 */
public class ReverseWordInString {
static ArrayList<String> ans = new ArrayList<>();
    public static void main(String[] args) {
        
        String s = "Let's take LeetCode contest";
        String str[] = s.split(" ");
        for(int i=0;i<str.length;i++){
            reverseString(str[i]);
        }
        System.out.println(String.join(" ", ans));
    }
    public static void reverseString(String s){
        char c[] = s.toCharArray();
        int st=0;
        int e=c.length-1;
        while(st<=e){
            char temp = c[st];
            c[st] = c[e];
            c[e] = temp;
            st++;
            e--;
        }
        ans.add(String.valueOf(c));
    }
    
}