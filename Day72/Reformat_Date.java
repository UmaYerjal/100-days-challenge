package Day72;

public class Reformat_Date {
    public static void main(String[] args) {
        String date = "5th Jan 2003";
        System.out.println(reformatDate(date));
    }
    public static String reformatDate(String date) {
        String month[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        String str[] = date.split(" ");

        String d = str[0];

        StringBuilder sb = new StringBuilder(str[0]);
 
        // Removing the last character
        // of a string
        sb.deleteCharAt(d.length() - 1);
        sb.deleteCharAt(d.length()-2);
       
       String ans = "";
       ans+=str[2];
       ans+="-";

        String m ="";

       for(int i=0;i<month.length;i++){
           if(month[i].equals(str[1])){
               m += Integer.toString(i+1);
           }
       }
    //    System.out.println(m);
    //    System.out.println(str[1]);

       if(m.length() == 2){
           ans +=m;
           ans+="-";
       }else{
           ans+="0";
           ans+=m;
           ans+="-";
       }

        String day = sb.toString();
       if(sb.length()==2){
           ans+=day;
       }else{
           ans+="0";
           ans+=day;
       }

        return ans;
    }
}
