public class FindClosestPairFromTwoArray{
    public static void main(String[] args) {
        int n=4,m=4;
        int arr[] = {1,4,5,7};
        int brr[] = {10,20,30,40};
        int x=32;
        int max = arr[0]+brr[0];
        int n1 =0,n2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int sum = arr[i] + brr[j];
                if(max<sum && sum <=x){
                    max = sum;
                    n1 = i;
                    n2 = j;
                }
            }
            
        }
        System.out.print(arr[n1]+" "+brr[n2]);
    }
}