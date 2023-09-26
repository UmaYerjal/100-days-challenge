public class ReverseTheString {
    // Input : UmaYerjal
    // Output : lajreYamU

    public static void main(String[] args) {
        String str="UmaYerjal";
        String s = "";
        for(int i=str.length()-2;i>=0;i--){
            char ch = str.charAt(i);
            s +=ch;
        }
        System.out.println(s);
    }
}
