package Day87;

import java.util.ArrayList;
import java.util.Arrays;

/*
You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.

 

Example 1:

Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.
Example 2:

Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
Output: ["Bob","Alice","Bob"]
Explanation: The first Bob is the tallest, followed by Alice and the second Bob.
 */
public class Sort_The_People {
    public static void main(String[] args) {
        String str[] = {"Mary","John","Emma"};
        int height[] = {180,165,170};
        String ans[] = sortPeople(str, height);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
    public static String[] sortPeople(String[] names, int[] heights) {

        ArrayList<Integer> a=new ArrayList<>();
        String b[]=new String[names.length];
        for(int i:heights)
        {
            a.add(i);
        }
        Arrays.sort(heights);
        int j=0;
        for(int i=heights.length-1;i>=0;i--)
        {
            b[j++]=names[a.indexOf(heights[i])];            
        }
        return b; 
    }
}
