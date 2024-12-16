import java.io.*;
import java.util.*;

class Solution {
    
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        
        for(int i = 0 ; i < arr.length ; i++){
            String now = arr[i];
            
            //문자 없으면 공백
            if(arr[i].length() == 0){
                answer += " "; 
            //문자 있으면
            }else{
                answer += now.substring(0,1).toUpperCase();
                answer += now.substring(1,now.length()).toLowerCase();
                answer += " ";
            }
        }
        if(s.substring(s.length()-1,s.length()).equals(" ")){
            return answer;
        }
        
        return answer.substring(0,answer.length()-1);
    }
}