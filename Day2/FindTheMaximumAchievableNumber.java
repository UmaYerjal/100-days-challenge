// Input: num = 4, t = 1
// Output: 6
// Explanation: The maximum achievable number is x = 6; it can become equal to num after performing this operation:
// 1- Decrease x by 1, and increase num by 1. Now, x = 5 and num = 5. 
// It can be proven that there is no achievable number larger than 6.
public class FindTheMaximumAchievableNumber {
    public static int theMaximumAchievableX(int num, int t) {
        return (num+2*t);
    }
    public static void main(String[] args) {
        int num =4,t=1;
        System.out.println(theMaximumAchievableX(num,t));

    }
}
