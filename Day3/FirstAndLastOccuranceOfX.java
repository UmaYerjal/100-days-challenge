import java.util.ArrayList;

public class FirstAndLastOccuranceOfX{
// n=9, x=5
// arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
// Output:  
// 2 5
// Explanation: 
// First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5.
static ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        ArrayList<Integer> ans =new ArrayList<>();
        int num=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                ans.add(i);
                num=i;
                break;
            }
        }
        
        for(int i=n-1;i>=num;i--){
            if(arr[i]==x){
                ans.add(i);
                break;
            }
        }
        if(ans.isEmpty()){
            ans.add(-1);
            ans.add(-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=9 , x=5;
        int arr[] ={1, 3, 5, 5, 5, 5, 67, 123, 125};
        ArrayList<Integer> ans = find(arr,n,x);
        System.out.println(ans);

    }
}