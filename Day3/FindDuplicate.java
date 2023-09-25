import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicate {
// Input:
// N = 4
// a[] = {0,3,1,2}
// Output: 
// -1
// Explanation: 
// There is no repeating element in the array. Therefore output is -1.

// Input : 
// N=7
// a[] ={1 2 4 1 2 4 2}
// output:
// 1 2 4
public static ArrayList<Integer> duplicates(int arr[], int n) {
    // code here
    ArrayList<Integer> ans = new ArrayList<>();
    Arrays.sort(arr);
    int num =-1;
    for(int i=0;i<n-1;i++){
        if(arr[i]==arr[i+1] && arr[i]!=num){
            num = arr[i];
            ans.add(arr[i]);
            i++;
        }
    }
    if(ans.size() == 0){
        ans.add(-1);
    }
    
    
    return ans;
}

public static void main(String[] args) {
    int n=7;
    int arr[] = {1,2,4,1,2,4,2};
    System.out.println(duplicates(arr, n));

}
}
