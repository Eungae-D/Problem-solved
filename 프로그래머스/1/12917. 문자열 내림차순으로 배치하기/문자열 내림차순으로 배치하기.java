import java.io.*;
import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        Character[] arr = new Character[s.length()];
        for(int i = 0 ; i < s.length(); i++){
            arr[i] = s.charAt(i);
        }
         Arrays.sort(arr, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length(); i++){
            sb.append(arr[i]);
        }
        
        answer = sb.toString();
        
        
        return answer;
    }
}