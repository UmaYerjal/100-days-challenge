import java.util.*;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "  hello world  ";
        String str[] = s.trim().split(" +");
        Collections.reverse(Arrays.asList(str));
        System.out.println(String.join(" ",str));
    }
}
