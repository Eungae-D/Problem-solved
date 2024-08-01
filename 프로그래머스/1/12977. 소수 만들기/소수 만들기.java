import java.io.*;
import java.util.*;

class Solution {
    public static boolean[] isPrime = new boolean[3010];
    public int solution(int[] nums) {
        int answer = 0;
        
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        
        for(int i = 2; i<3010 ; i++){
            if(!isPrime[i]) continue;
            
            for(int j = i*i ; j < 3010 ; j+=i){
                isPrime[j] = false;
            }
        }
        
        for(int i = 0 ; i < nums.length-2 ; i++){
            for(int j = i+1 ; j < nums.length-1 ; j++){
                for(int k = j+1 ; k < nums.length ; k++){
                    if(isPrime[nums[i]+nums[j]+nums[k]] == true){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}