import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int[] answer;    
        int size = arr.length;
        
        switch(size){
            case 1 :
                answer = new int[1];
                answer[0] = -1;
                break;
            default :
                answer = new int[size-1];
                int min = Integer.MAX_VALUE;
                int index = 0;

                for(int i = 0 ; i < size ; i++){
                    min = Math.min(min, arr[i]);
                }
                
                for(int i = 0 ; i < size ; i++){
                    if(min==arr[i]) continue;
                    answer[index] = arr[i];
                    index++;
                }
                
                
                
        }
        
        
        return answer;
    }
}