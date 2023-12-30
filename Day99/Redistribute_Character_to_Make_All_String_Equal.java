package Day99;

public class Redistribute_Character_to_Make_All_String_Equal {
    public static void main(String[] args) {
        String words[]={"abc","aabc","bc"};
        System.out.println(makeEqual(words));
    }
    public static boolean makeEqual(String[] words) {
        if (words.length == 1) {
			return true;
		}
        int[] alphabets_counter = new int[26];

        int totalCharCount = 0;
		for (String s : words) {
			totalCharCount += s.length();
		}
		if (totalCharCount % words.length != 0) {
			return false;
		}
        
        for(int i=0;i<words.length;i++){
            for (char c : words[i].toCharArray())
                alphabets_counter[c-'a']++;
        }
        for (int i : alphabets_counter){
                if(i%words.length != 0){
                    return false;
                }
        }
        return true;

    }
}
