package Day12;

/*
Example 1:
Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output: 1 10000
Explanation: minimum and maximum elements of array are 1 and 10000.
 
Example 2:
Input:
N = 5
A[]  = {1, 345, 234, 21, 56789}
Output: 1 56789
Explanation: minimum and maximum element of array are 1 and 56789.
 */
class Pair{
    long first,second;
    public Pair(long first,long second){
        this.first=first;
        this.second=second;
    }
}
public class FindMinAndMaxInArray {
    public static void main(String[] args) {
        long a[] = {3, 2, 1, 56, 10000, 167};
        long n=6;
        Pair p=getMinMax(a, n) ;
        System.out.println(p.first+" "+p.second);
    }
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long s = Integer.MAX_VALUE;
        long l = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>l){
                l = a[i];
            }
            if(a[i]<s){
                s=a[i];
            }
        }
        Pair p1 = new Pair(s, l);
        return p1;
    }
}
