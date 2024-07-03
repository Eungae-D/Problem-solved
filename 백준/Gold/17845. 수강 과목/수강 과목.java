import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N, K;
    private static int[][] subjects;
    private static int[][] memo;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        subjects = new int[K][2];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            subjects[i][0] = Integer.parseInt(st.nextToken());
            subjects[i][1] = Integer.parseInt(st.nextToken());
        }

        memo = new int[K][N + 1];
        for (int i = 0; i < K; i++) {
            for (int j = 0; j <= N; j++) {
                memo[i][j] = -1;
            }
        }
    }

    public static int recur(int cur, int remainingTime) {
        if(remainingTime < 0) return Integer.MIN_VALUE;
        if (cur == K) return 0;

        if (memo[cur][remainingTime] != -1) {
            return memo[cur][remainingTime];
        }
        int maxImportance = Math.max(recur(cur + 1, remainingTime),recur(cur + 1, remainingTime - subjects[cur][1]) + subjects[cur][0]);

        memo[cur][remainingTime] = maxImportance;
        return maxImportance;
    }

    public static void process() {
        int result = recur(0, N);
        System.out.println(result);
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}