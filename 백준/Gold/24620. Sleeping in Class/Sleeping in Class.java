import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int T, N;
    private static int[] sum;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());
            sum = new int[N + 1];

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                sum[i] = sum[i - 1] + Integer.parseInt(st.nextToken());
            }
            process();
        }
        System.out.println(sb);
    }

    public static void process() {
        for (int tc = 1; tc <= T; tc++) {
            for (int i = N; i >= 1; i--) {
                if (check(i)) {
                    sb.append(N - i).append("\n");
                    return;
                }
            }
        }
        sb.append(0).append("\n");
    }

    private static boolean check(int i) {
        if (sum[N] % i != 0) return false;
        int s = 0;
        int e;

        for (e = 1; e <= N; e++) {
            if (sum[e] - sum[s] > sum[N] / i) return false;
            if (sum[e] - sum[s] == sum[N] / i) s = e;
        }
        return s == e - 1;
    }

    public static void main(String[] args) throws Exception {
        input();
    }
}
