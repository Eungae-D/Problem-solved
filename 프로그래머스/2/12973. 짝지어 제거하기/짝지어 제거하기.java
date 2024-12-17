import java.io.*;
import java.util.*;

class Solution{
    private static Stack<Character> stack = new Stack<>();
    private static char[] ch;
    public int solution(String s){
        ch = s.toCharArray();
        
        for(char c : ch){
            if(stack.isEmpty()){
                stack.push(c);
            }else{
                if(stack.peek()==c){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
