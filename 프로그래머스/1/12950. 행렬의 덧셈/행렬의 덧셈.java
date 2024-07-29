class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        int rows = arr1.length;         // 행의 수
        int cols = arr1[0].length;      // 열의 수
        
        
        int[][] answer = new int[rows][cols];  // 결과 배열 초기화
        
        // 행렬 덧셈 수행
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

      
        
        
        
        return answer;
    }
}