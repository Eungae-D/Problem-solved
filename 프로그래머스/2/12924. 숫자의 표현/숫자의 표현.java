class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int s = 0;
        int e = 0;
        
        while(e <= n){
            if(sum==n){
                answer++;
                e++;
                sum+=e;
            }else if(sum < n){
                e++;
                sum+=e;
            }else{
                sum -=s;
                s++;
            }

        }
        return answer;
    }
}