import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb = new StringBuilder();
    private static int N;
    private static int[][] input;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        input = new int[N][5];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    public static void process() {
        int max = 0;
        int num = 0;

        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                for (int k = 0; k < 5; k++) {
                    if (input[i][k] == input[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (max < cnt) {
                max = cnt;
                num = i;
            }
        }

        sb.append(num + 1);
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        input();
        process();
    }
}
