package Day30;

import java.util.ArrayList;
import java.util.List;

/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
 

Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
 */
public class FizzBuzz {
    public static void main(String[] args) {
        int n=15;
        List<String> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                arr.add("FizzBuzz");
            }else if(i%3==0){
                arr.add("Fizz");
            }else if(i%5==0){
                arr.add( "Buzz");
            }else{
                arr.add(Integer.toString(i))    ;
            }
        }
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i));
        }
    }
}
