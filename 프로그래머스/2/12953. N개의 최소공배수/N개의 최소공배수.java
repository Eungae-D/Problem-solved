import java.io.*;
import java.util.*;

class Solution {
    private static int gcd(int a, int b){
        int temp = 0;
        while(a%b!=0){
            temp = a%b;
            a = b;
            b = temp;
        }
        return b;
    }
    public int solution(int[] arr) {
        int answer = 0;

        if(arr.length == 1) return arr[0];
        
        int gcd = gcd(arr[0],arr[1]);
        answer = (arr[0]*arr[1])/gcd;
        
        System.out.println(answer);
        
        
        if(arr.length>2){
            for(int i = 2 ; i < arr.length; i++){
                gcd = gcd(answer,arr[i]);
                answer = (answer*arr[i])/gcd;
            }
        }

            
        return answer;
    }
}