import java.io.*;
import java.util.*;

class Solution {
    private String shift(String s){
        return s.substring(1)+s.charAt(0);
    }
    
    private boolean verification(String s){
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek()=='(' && s.charAt(i)==')'){
                    stack.pop();
                }else if(stack.peek()=='[' && s.charAt(i)==']'){
                    stack.pop();
                }else if(stack.peek()=='{' && s.charAt(i)=='}'){
                    stack.pop();
                }else return false;
            }
        }
        
        return stack.isEmpty();
    }
    
    public int solution(String s) {
        
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(verification(s)){
                answer++;
            }
            
            s = shift(s);
        }
        
        return answer;
    }
}