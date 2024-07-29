import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int test = commands.length;
        int[] answer = new int[test];
        
        for (int tc = 0; tc < test; tc++) {
            int start = commands[tc][0];
            int end = commands[tc][1];
            int k = commands[tc][2];
            
            int[] subArray = Arrays.copyOfRange(array, start - 1, end);
            
            Arrays.sort(subArray);
            
            answer[tc] = subArray[k - 1];
        }
        
        return answer;
    }
}
