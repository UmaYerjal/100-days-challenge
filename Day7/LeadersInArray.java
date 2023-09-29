/*
Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.
 */

import java.util.ArrayList;

public class LeadersInArray {
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            boolean num=true;
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    num=false;
                    break;
                }
            }
            if(num==true){
                a.add(arr[i]);
            }
        }
        a.add(arr[n-1]);
        return a;
    }
    public static void main(String[] args) {
        int a[]= {16,17,4,3,5,2};
        int n=a.length;
        System.out.println(leaders(a, n));
    }
}
