package Day78;

import java.util.ArrayList;

public class Reverse_Vowels_Of_a_String {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str);
        System.out.println(reverseVowels(str));
    }
    public static String reverseVowels(String s) {
        ArrayList<Character> Vowel = new ArrayList<Character>();

        Vowel.add('a');
        Vowel.add('e');
        Vowel.add('i');
        Vowel.add('o');
        Vowel.add('u');
        Vowel.add('A');
        Vowel.add('E');
        Vowel.add('I');
        Vowel.add('O');
        Vowel.add('U');


        int st=0;
        int en= s.length()-1;
        char arr[] = s.toCharArray();
        while(st<=en){
            if(Vowel.contains(arr[st]) && Vowel.contains(arr[en])){
                char temp = arr[st];
                arr[st] = arr[en];
                arr[en] = temp;
                st++;
                en--;
            }
            else if(!(Vowel.contains(arr[st]))){
                st++;
            }else{
                en--;
            }
        }
        String str="";
        for(int i=0;i<arr.length;i++){
            str+=arr[i];
        }
        return str;
    }
}
