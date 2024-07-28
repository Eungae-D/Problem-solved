import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] temp = new int[arr.length];
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]%divisor==0){
                temp[i] = arr[i];
                count++;
            }
        }
        Arrays.sort(temp);
        
        int[] answer = new int[count];
        if(count>0){
            answer = new int[count];
            int index = 0 ;
            for(int i = 0 ; i < temp.length ; i++){
                if(temp[i]!=0){
                    answer[index] = temp[i];
                    index++;
                }
            }
        }else{
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}