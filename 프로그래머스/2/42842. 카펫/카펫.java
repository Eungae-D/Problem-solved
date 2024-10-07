class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown+yellow;
        
        for(int i = 3 ; i*i <= sum ; i++){
            int j = sum/i;
            
            if(sum%i==0 && j >=3 ){
                int center = (j-2)*(i-2);
                
                if(center == yellow){
                    answer[0] = j;
                    answer[1] = i;
                    return answer;
                }
            }
            
        }
        return answer;
    }
}