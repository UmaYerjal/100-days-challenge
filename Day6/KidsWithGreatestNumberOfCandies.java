package Day6;

import java.util.ArrayList;

// Input: candies = [2,3,5,1,3], extraCandies = 3
// Output: [true,true,true,false,true] 
// Explanation: If you give all extraCandies to:
// - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
// - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
// - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
// - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
// - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int candies[] = {2,3,5,2,3};
        int extra = 3;

        ArrayList<Boolean> ls = new ArrayList<>();

        int max=0;
        for(int i=0;i<candies.length;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            int sum = candies[i]+extra;
            if(sum>max){
                ls.add(true);
            }else{
                ls.add(false);
            }
        }
    }
}
