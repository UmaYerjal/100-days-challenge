package Day16;
/*
You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

Given the string command, return the Goal Parser's interpretation of command.

Example 1:

Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".
Example 2:

Input: command = "G()()()()(al)"
Output: "Gooooal"
 */
public class Goal_Parser_Interpretation {
    public static void main(String[] args) {
        String str = "G()()()()(al)";
        System.out.println(interpret(str));
    }
    public static String interpret(String command) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<command.length()-1;i++){
            if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                str.append('o');
                i++;
            }else{
                if(command.charAt(i) !='(' && command.charAt(i) != ')'){
                    str.append(command.charAt(i));
                }
                
            }
        }
        int i=command.length()-1;
        if(command.charAt(i) !='(' && command.charAt(i) != ')'){
            str.append(command.charAt(i));
        }
        return str.toString();
    }
}
