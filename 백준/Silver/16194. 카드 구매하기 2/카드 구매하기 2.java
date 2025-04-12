import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int[] p = new int[1001];
    private static int[] D = new int[10001];
    private static StringBuilder sb = new StringBuilder();

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void process() {
        for (int i = 1; i <= N; i++) {
            D[i] = p[i]; 
            for (int j = 1; j <= i; j++) {
                D[i] = Math.min(D[i], D[i - j] + p[j]);
            }
        }

        sb.append(D[N]).append("\n");
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        input();
        process();
    }
}
