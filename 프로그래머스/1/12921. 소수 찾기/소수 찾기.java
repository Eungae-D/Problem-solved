import java.util.*;
import java.io.*;

class Solution {
    public static boolean[] isPrime = new boolean[1000010];
    public int solution(int n) {
        int answer = 0;
        
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;
        
        for(long i = 2; i < 1000010 ; i++){
            if(!isPrime[(int)i]) continue;
            
            for(long j = i*i ; j < 1000010 ; j+=i){
                isPrime[(int)j] = false;
            }
        }
        
        
        for(int i = 2 ; i <= n ; i++){
            if(isPrime[i]) answer++;
        }
        
        
        return answer;
    }
}