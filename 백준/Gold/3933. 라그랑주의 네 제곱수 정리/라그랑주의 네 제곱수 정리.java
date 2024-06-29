import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static int input;
    private static int[][][] dp;
    private static int range;

    // 입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        // 최대 범위 설정
        range = (int) Math.sqrt(32768);  // 32768은 215^2보다 크므로 충분히 커버됨

        // dp 배열 초기화
        dp = new int[range + 1][5][33000];
        for (int i = 0; i <= range; i++) {
            for (int j = 0; j < 5; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        while (true) {
            input = Integer.parseInt(br.readLine());
            if (input == 0) break;


            sb.append(process(input)).append("\n");
        }

       
        System.out.print(sb.toString());
    }

    // 재귀 함수
    public static int recur(int cur, int cnt, int value) {
        if (cnt > 4) return 0;  
        if (value == 0) return 1;  
        if (cur * cur > value) return 0; 

        if (dp[cur][cnt][value] != -1) return dp[cur][cnt][value];

        int count = 0;

        // 현재 제곱수를 사용하는 경우
        int square = cur * cur;
        if (value >= square) {
            count += recur(cur, cnt + 1, value - square);
        }

        // 다음 제곱수로 넘어가는 경우
        count += recur(cur + 1, cnt, value);

        dp[cur][cnt][value] = count;
        return count;
    }

    // 실행
    public static int process(int input) {
        return recur(1, 0, input);
    }

    public static void main(String[] args) throws Exception {
        input();
    }
}