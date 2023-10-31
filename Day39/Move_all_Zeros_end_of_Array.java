package Day39;

public class Move_all_Zeros_end_of_Array {
    public static void main(String[] args) {
        int arr[] ={3,4,0,0,4};
        int n = arr.length;
        pushZerosToEnd(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void pushZerosToEnd(int[] arr, int n) {
        // code here
        int arr1[] = new int[n];
	    int k=0;
	    
	    for(int i=0;i<n;i++){
	        if(arr[i]>0){
	            arr1[k] = arr[i];
	            k++;
	        }
	    }
	    for(int i=0;i<n;i++){
	        if(arr[i] == 0){
	            arr1[k] = arr[i];
	            k++;
	        }
	    }
	    
	    for(int i=0;i<n;i++){
	        arr[i] = arr1[i];
	    }
    }
}
