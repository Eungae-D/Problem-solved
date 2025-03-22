import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;

    private static int N;
    private static int[] arr;
    private static boolean[] visited;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        visited = new boolean[N + 1];
    }

    public static void process() {
        recur(0);
        System.out.print(sb.toString());
    }

    public static void recur(int cur) {
        if (cur == N) {
            for (int i = 0; i < N; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[cur] = i;
                recur(cur + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
