import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int N;
    private static final int SIZE = 1000001;
    private static int[] player;
    private static boolean[] card;
    private static int[] score;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        player = new int[N];
        card = new boolean[SIZE];
        score = new int[SIZE];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; ++i) {
            player[i] = Integer.parseInt(st.nextToken());
            card[player[i]] = true;
        }
    }

    public static void process() {
        for (int i : player) {
            for (int j = i * 2; j < SIZE; j += i) {
                if (card[j]) {
                    ++score[i];
                    --score[j];
                }
            }
        }
        for (int num : player)
            sb.append(score[num]).append(' ');
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
        System.out.println(sb);
    }
}