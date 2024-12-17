class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown+yellow;
        
        for(int i = 3 ; i <= sum ; i++){
            int col = i;
            int row = sum/col;
            
            if(sum%i==0 && row >= 3){
                int center = (col-2)*(row-2);
                
                if(center == yellow){
                    answer[0] = row;
                    answer[1] = col;
                    return answer;
                }
            }
        }
        
        return answer;
    }
}