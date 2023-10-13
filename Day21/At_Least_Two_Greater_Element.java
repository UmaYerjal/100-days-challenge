import java.util.Arrays;

public class At_Least_Two_Greater_Element {
    public static void main(String[] args) {
       int arr[] = {2,8,7,1,5};
       Arrays.sort(arr);
       for(int i=0;i<arr.length-2;i++){
        System.out.print(arr[i]+" ");
       } 
    }
    
}
