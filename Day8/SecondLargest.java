import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Input: 
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
Explanation: The largest element of the 
array is 35 and the second largest element
is 34.

Input: 
N = 3
Arr[] = {10, 5, 10}
Output: 5
Explanation: The largest element of 
the array is 10 and the second 
largest element is 5.

*/

public class SecondLargest {
    public static void main(String[] args) {
        int n = 8;
        int arr[] ={12,35, 1, 10, 34, 1, 34, 35};

        List<Integer> a = new ArrayList<>();
        
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                continue;
            }else{
                a.add(arr[i]);
            }
        }
        if(!(a.contains(arr[n-1]))){
            a.add(arr[n-1]);
        }
        List<Integer> newList = a.stream().distinct().collect(Collectors.toList());
        int m=-1;
        if(newList.size()>1){
            m = newList.get(newList.size()-2);
        }
        System.out.println(m);

    }
    
}
