import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    private static int N, M;
    private static int[] unit, pack;
    private static StringBuilder sb = new StringBuilder();

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        unit = new int[M];
        pack = new int[M];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            pack[i] = Integer.parseInt(st.nextToken());
            unit[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void process() {
        Arrays.sort(unit);
        Arrays.sort(pack);

        int minCost = Math.min(((N / 6) + 1) * pack[0], N * unit[0]);
        minCost = Math.min(minCost, (N / 6) * pack[0] + (N % 6) * unit[0]);

        sb.append(minCost);
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        input();
        process();
    }
}
