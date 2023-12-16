package Day84;

import java.util.Arrays;

public class Valid_Anagram {
    public static void main(String[] args) {
        String str="anagram";
        String str2="nagaram";
        System.out.println(isAnagram(str, str2));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() !=t.length()){
            return false;
        }
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}
