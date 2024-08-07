import java.util.*;
import java.io.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        
        for(int i = score.length-1; i >= m-1 ; i-=m){
            answer += score[i-m+1] * m;
        }
        
        
        Integer[] scoreArray = Arrays.stream(score).boxed().toArray(Integer[]::new);
        
        
        return answer;
    }
}