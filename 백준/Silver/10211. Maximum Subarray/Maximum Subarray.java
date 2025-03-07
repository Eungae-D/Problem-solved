import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int T, N;
    private static int[] arr, dp;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());
    }

    public static void process() throws Exception {
        for (int c = 0; c < T; c++) {
            N = Integer.parseInt(br.readLine());
            arr = new int[N + 1];
            dp = new int[N + 1];

            st = new StringTokenizer(br.readLine());
            int max = Integer.MIN_VALUE;

            for (int i = 1; i <= N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                dp[i] = dp[i - 1] + arr[i];
                max = Math.max(max, Math.max(arr[i], dp[i]));
            }

            for (int i = 1; i <= N; i++) {
                for (int j = N; j > i; j--) {
                    max = Math.max(max, dp[j] - dp[i]);
                }
            }

            sb.append(max).append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
