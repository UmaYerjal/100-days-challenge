package Day6;

public class WaveArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int size = a.length;
        if(size%2==0){
            for(int i=0;i<a.length;i++){
                int temp = a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                i++;
            }
        }else{
            for(int i=0;i<a.length-1;i++){
                int temp = a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                i++;
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}
