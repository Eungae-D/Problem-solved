import java.io.*;
import java.util.*;

class Solution {
    public static boolean same(String word1, String word2){
        if(word1.charAt(word1.length()-1) == word2.charAt(0)){
            return false;
        }
        return true;
    }
    public int[] solution(int n, String[] words){
        int[] answer = new int[2];
        
        ArrayList<String> list = new ArrayList<>();
        list.add(words[0]);
        
        for(int i = 1 ; i < words.length ; i++){
            if(list.contains(words[i])||same(list.get(i-1),words[i])){
                answer[0] = i%n +1;
                answer[1] = i/n +1;
                break;
            }
            list.add(words[i]);
        }
        return answer;
    }
}