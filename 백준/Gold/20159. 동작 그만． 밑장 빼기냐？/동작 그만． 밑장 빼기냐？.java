import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N, cards[];

    public static void input() throws Exception{
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        cards = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static int process() {

        int[][] sum = new int[2][N / 2 + 1];
        for (int i = 0; i < N; i++) {
            if ((i + 1) % 2 == 0) sum[0][i / 2 + 1] = sum[0][i / 2] + cards[i];
            else sum[1][i / 2 + 1] = sum[1][i / 2] + cards[i];
        }

        int max = 0;
        int [] ans = new int[N+1];
        for (int i = 1; i <= N; i++) {
            int idx = i / 2 + 1;
            if (i % 2 == 0) ans[i] = sum[1][idx-1]+(sum[0][N/2-1]-sum[0][idx-2]);
            else ans[i] = sum[1][idx-1]+(sum[0][N/2-1]-sum[0][idx-1])+cards[N-1];

            max = Math.max(max,ans[i]);
        }

        return max;
    }

    public static void main(String[] args) throws Exception {
        input();
        System.out.println(process());
    }
}
