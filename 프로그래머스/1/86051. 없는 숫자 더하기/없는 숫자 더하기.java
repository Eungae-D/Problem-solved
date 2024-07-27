class Solution {
    private static boolean[] visited = new boolean[10];
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int i = 0 ; i < numbers.length ; i++){
            visited[numbers[i]] = true;
        }
        
        for(int i = 1 ; i < 10 ; i++){
            if(visited[i] == false){
                answer+=i;
            }
        }
        return answer;
    }
}