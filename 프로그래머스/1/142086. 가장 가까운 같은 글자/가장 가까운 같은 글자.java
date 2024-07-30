import java.io.*;
import java.util.*;

class Solution {
    public static int[] visited = new int[26];
    public static int[] answer;
    
    public int[] solution(String s) {
        answer = new int[s.length()];
        
        Arrays.fill(visited, -1);
        
        for(int i = 0 ; i < s.length() ; i++){
            int index = s.charAt(i)-'a';
            
            if(visited[index] == -1){
                answer[i] = -1;
                visited[index] = i;
            }else{
                answer[i] = i-visited[index];
                visited[index] = i;
            }
        }
        
    
        return answer;
    }
}