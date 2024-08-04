import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer, Double> map = new HashMap<>();
        
        int[] answer = new int[N];
        int[] failcount = new int[N+2];
        int person = 0;
        // int[] 
        for(int i = 0 ; i < stages.length ; i++){
            failcount[stages[i]]++;
            person++;
        }
        
        // System.out.println(Arrays.toString(failcount));
        
        for(int i = 1 ; i < failcount.length-1 ; i++){
            if(failcount[i]==0 || person == 0){
                map.put(i,0.0);
                // System.out.println(i+" "+0.0);
            }else{
                map.put(i,(double)failcount[i]/person);
                // System.out.println(i+" "+(double)failcount[i]/person);
                person -= failcount[i];
            }
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        
        keySet.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return map.get(o2).compareTo(map.get(o1));
            }
        });
        
        for(int i = 0 ; i < keySet.size() ; i++){
            answer[i] = keySet.get(i);
        }
    
        return answer;
    }
}