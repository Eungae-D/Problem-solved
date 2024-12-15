import java.io.*;
import java.util.*;
class Solution
{
    public int solution(int []A, int []B){
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0 ; i < A.length ; i++){
            answer+=A[i]*B[A.length-i-1];
        }
        
        // Integer[] B_Integer = Arrays.stream(B).boxed().toArray(Integer[]::new);
        // Arrays.sort(B_Integer, Collections.reverseOrder());
        
        return answer;
    }
}