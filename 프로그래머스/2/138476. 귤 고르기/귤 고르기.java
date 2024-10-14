import java.io.*;
import java.util.*;

class Solution {
    private static TreeMap<Integer, Integer> map = new TreeMap<>();
    private static ArrayList<Integer> valueList;
    public int solution(int k, int[] tangerine) {
        int sum = 0;
        int cnt = 0;
        
        for(int num : tangerine){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        
        valueList = new ArrayList<>(map.values());
        Collections.sort(valueList,Collections.reverseOrder());
        
        
        for(int v : valueList){
            if(sum+v>=k){
                cnt++;
                break;
            }else{
                sum+=v;
                cnt++;
            }
        }
        
        
        return cnt;
    }
}