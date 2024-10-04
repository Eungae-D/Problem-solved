class Solution {
    private static int[] dp = new int[100010];
    
    public int solution(int n) {
        
        dp[1] = 1;
        
        for(int i = 2 ; i < 100010; i++){
            dp[i] = (dp[i-1]+dp[i-2])%1234567;
        }
        
        return dp[n];
    }
}