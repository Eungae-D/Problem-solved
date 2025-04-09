import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    private static BufferedReader br;
    private static int N;
    private static BigInteger[] dp;

    // 입력
    public static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
    }

    // 실행
    public static void process() {
        if (N == 0) {
            System.out.println("0");
        } else if (N == 1) {
            System.out.println("1");
        } else {
            dp = new BigInteger[N + 1];
            dp[0] = BigInteger.ZERO;
            dp[1] = BigInteger.ONE;
            for (int i = 2; i <= N; i++) {
                dp[i] = dp[i - 2].add(dp[i - 1]);
            }
            System.out.println(dp[N]);
        }
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
