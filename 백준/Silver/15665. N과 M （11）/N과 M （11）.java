import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int N, M;
    private static int[] arr, selected;
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        selected = new int[M];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
    }

    public static void recur(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        int prev = -1;
        for (int i = 0; i < N; i++) {
            if (arr[i] == prev) continue;

            prev = arr[i];
            selected[depth] = arr[i];
            recur(depth + 1);
        }
    }

    public static void process() {
        recur(0);
        System.out.print(sb);
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
