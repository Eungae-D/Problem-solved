import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final int MAX_INPUT = 100001;
    static int[] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        memo = new int[N+1];

        // 제곱수들 1로 초기화
        for (int i = 1; i <= (int)Math.sqrt(N); i++) {
            memo[i*i] = 1;
        }
        System.out.print(dp(N));
    }

    public static int dp(int N){
        if(memo[N] == 0){
            memo[N] = MAX_INPUT;
            for (int i = (int)Math.sqrt(N); i >= 0; i--) {
                int pow = (int) Math.pow(i, 2);
                memo[N] = Math.min(dp(N - pow) + 1, memo[N]);
            }
        }
        return memo[N];
    }
}