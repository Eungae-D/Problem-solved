import java.io.*;
import java.util.*;

class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        
        int size = phone_number.length();
        
        for(int i = 0 ; i < size-4 ; i++){
            sb.append("*");
        }
        
        for(int i = 4 ; i >= 1; i--){
            sb.append(phone_number.charAt(size-i));
        }
        
        return sb.toString();
    }
}