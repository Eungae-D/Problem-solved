class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        long cur = 0;
        
        for(int i = 0 ; i < n ; i++){
            answer[i] = cur+x;
            cur = cur+x;
        }
        return answer;
    }
}