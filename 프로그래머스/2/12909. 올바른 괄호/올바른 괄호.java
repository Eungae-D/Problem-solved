import java.io.*;
import java.util.*;

class Solution{
    private static int size = 0;
    private static Stack<Character> stack = new Stack<>();
    
    boolean solution(String s) {
        size = s.length();
        
        
        for(int i = 0 ; i < size ; i++){
            char temp = s.charAt(i);
            
            if(temp == '('){
                stack.push(temp);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
        
        
    }
    
}