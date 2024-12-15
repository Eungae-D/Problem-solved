import java.io.*;
import java.util.*;

class Solution {
    private static String[] arr;
    private static String answer = "";
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;
    
    public String solution(String s) {
        arr = s.split(" ");
        
        for(int i = 0 ; i < arr.length ; i++){
            int temp = Integer.valueOf(arr[i]);
            max = Math.max(max,temp);
            min = Math.min(min,temp);
        }
        
        return min+" "+max;
    }
    
    
}