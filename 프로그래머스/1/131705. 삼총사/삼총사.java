class Solution {
    public static boolean[] visited;
    public static int answer = 0;
    
    public static void recur(int cur, int count, int sum, int[] arr){
        if(count == 3){
            if(sum == 0) answer++;
            
            return;
        }
        
        if(cur==arr.length){
            return;
        }
        
        recur(cur+1, count+1, sum+arr[cur], arr);
        recur(cur+1,count,sum,arr);
    }
    
    public int solution(int[] number) {
        recur(0, 0,0, number);
        return answer;
    }
    
    
}