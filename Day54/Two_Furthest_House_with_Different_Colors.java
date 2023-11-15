package Day54;
/*
There are n houses evenly lined up on the street, and each house is beautifully painted. You are given a 0-indexed integer array colors of length n, where colors[i] represents the color of the ith house.

Return the maximum distance between two houses with different colors.

The distance between the ith and jth houses is abs(i - j), where abs(x) is the absolute value of x.

 

Example 1:


Input: colors = [1,1,1,6,1,1,1]
Output: 3
Explanation: In the above image, color 1 is blue, and color 6 is red.
The furthest two houses with different colors are house 0 and house 3.
House 0 has color 1, and house 3 has color 6. The distance between them is abs(0 - 3) = 3.
Note that houses 3 and 6 can also produce the optimal answer.
Example 2:


Input: colors = [1,8,3,8,3]
Output: 4
Explanation: In the above image, color 1 is blue, color 8 is yellow, and color 3 is green.
The furthest two houses with different colors are house 0 and house 4.
House 0 has color 1, and house 4 has color 3. The distance between them is abs(0 - 4) = 4.
 */
public class Two_Furthest_House_with_Different_Colors {
    public static void main(String[] args) {
        int arr[] = {4,4,4,11,4,4,11,4,4,4,4,4};
        System.out.println(maxDistance(arr));
    }
    public static int maxDistance(int[] colors) {
        int first = colors[0];
        int index = 0;
        for(int a = 1; a < colors.length; a++){
            if(colors[a] != first) index = a;
        }
        int last = colors[colors.length-1];
        int index2 = colors.length-1;
        for(int a = colors.length-1; a > -1; a--){
            if(colors[a] != last) index2 = a;
        }
        int revindex = (colors.length-1)-index2;
        return Math.max(index, revindex);
    }
}
