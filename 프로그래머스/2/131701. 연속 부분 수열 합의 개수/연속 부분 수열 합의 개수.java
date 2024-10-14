import java.util.*;

class Solution {
    private static TreeSet<Integer> set = new TreeSet<>();
    public int solution(int[] elements) {
        
        for(int i = 0; i < elements.length; i++){
            int sum = 0;
            for(int j = 0; j < elements.length; j++){
                sum += elements[(i+j)%elements.length];
                set.add(sum);
            }
        }
        
        
        return set.size();
    }
}