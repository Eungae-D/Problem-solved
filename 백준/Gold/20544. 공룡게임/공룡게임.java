import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[][][][] dp;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        dp = new int[N][3][2][2];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 2; l++) {
                        dp[i][j][k][l] = -1;
                    }
                }
            }
        }
    }

    static long recur(int cur, int cnt1, int cnt2, int two) {
        if (cnt1 > 2 || cnt2 >= 2) return 0;
        if (cur == N) return two;

        if (dp[cur][cnt1][cnt2][two] != -1) return dp[cur][cnt1][cnt2][two];

        dp[cur][cnt1][cnt2][two] = (int)((recur(cur + 1, 0, 0, two) // 바닥
                + recur(cur + 1, cnt1 + 1, cnt2, two) // 높이 1인 선인장
                + recur(cur + 1, cnt1 + 1, cnt2 + 1, 1)) % 1000000007); // 높이 2인 선인장
        return dp[cur][cnt1][cnt2][two];
    }

    public static void process() {
        long result = recur(1, 0, 0, 0);
        System.out.println(result);
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}