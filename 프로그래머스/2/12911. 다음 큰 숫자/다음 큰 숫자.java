class Solution {
    public int binary(int n){
        int one = 0;
        
        while(n>0){
            if(n%2==1){
                one++;
            }
            n/=2;
        }
        return one;
    }
    
    public int solution(int n){
        int answer = 0;
        int oneCnt = binary(n);
        
        while(true){
            int nextCnt = binary(++n);
            if(oneCnt==nextCnt) break;
        }
        answer = n;
        return answer;
    }
}