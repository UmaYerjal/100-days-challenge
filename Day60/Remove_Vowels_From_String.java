package Day60;

public class Remove_Vowels_From_String {
    public static void main(String[] args) {
        String s= "Welcome to The Uma's Program";
        System.out.println(removeVowels(s));
    }
    public static String removeVowels(String S) {
            // code here
            String str="";
            for(int i=0;i<S.length();i++){
                if(S.charAt(i)=='a' || S.charAt(i)=='e' || S.charAt(i)=='i' || S.charAt(i)=='o' || S.charAt(i)=='u'){
                    continue;
                }
                str+=S.charAt(i);
                
            }
            return str;
            
            // return S.replaceAll("[aeiou]","");
    }
}