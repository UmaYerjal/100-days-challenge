package Day27;
/*
Given a list of names, display the longest name.

Example:
Input:
N = 5
names[] = { "Geek", "Geeks", "Geeksfor",
  "GeeksforGeek", "GeeksforGeeks" }

Output:
GeeksforGeeks
 */
public class Display_Longest_Name {
    public static void main(String[] args) {
        String names[] = { "Geek", "Geeks", "Geeksfor",
  "GeeksforGeek", "GeeksforGeeks" };
    int n = names.length;
    System.out.println(longest(names, n));

    }
    static String  longest(String names[], int n) {
        int max =0;
        for(int i=0;i<n;i++){
            int curr_len = names[i].length();
            max = Math.max(curr_len,max);
        }
        String str="";
        for(int i=0;i<n;i++){
            if(max == names[i].length()){
                str= names[i];
            }
        }
        return str;
        
    }
}
