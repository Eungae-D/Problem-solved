import java.io.*;
import java.util.*;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
    
        if(a==b) return a;
        
        answer+=a+b;
        if(a>b){
            while(a!=b+1){
                a--;
                answer += a;
            }
        }else{
            while(a!=b-1){
                a++;
                answer += a;
            }
        }
        
        
        
        return answer;
    }
}