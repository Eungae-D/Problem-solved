
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;

    private static int[] snow;
    private static int N, M;
    private static int answer = 0;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        snow = new int[N + 1];
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            snow[i] = Integer.parseInt(st.nextToken());
        }

        sb = new StringBuilder();
    }

    private static void recur(int time, int size, int pos) {
        if (time == M || pos >= N) { 
            answer = Math.max(size, answer);
            return;
        }

        for (int i = 1; i <= 2; i++) {
            if (pos + i <= N) {
                if (i == 1) {
                    recur(time + 1, size + snow[pos + i], pos + i); 
                } else {
                    recur(time + 1, (size / 2) + snow[pos + i], pos + i); 
                }
            }
        }
    }

    public static void process() {
        recur(0, 1, 0);
        sb.append(answer);
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
        System.out.println(sb);
    }
}
