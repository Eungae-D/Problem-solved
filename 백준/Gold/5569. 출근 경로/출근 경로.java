import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int W,H;
    private static int MOD = 100000;
    private static int [][][][]dp;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        W = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        dp = new int[W+1][H+1][2][2];

        for(int i = 1; i <= W ; i++){
            dp[i][1][0][0]= 1;
        }
        for(int i = 1; i <= H ; i++){
            dp[1][i][1][0]= 1;
        }
    }

    public static void process() {
        for(int i = 2; i <=W ; i++){
            for(int j = 2; j <=H; j++){
                dp[i][j][0][0] = (dp[i - 1][j][0][0] + dp[i - 1][j][0][1]) % MOD;
                dp[i][j][0][1] = dp[i - 1][j][1][0] % MOD;
                dp[i][j][1][0] = (dp[i][j-1][1][1] + dp[i][j-1][1][0]) % MOD;
                dp[i][j][1][1] = dp[i][j - 1][0][0] % MOD;
            }
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
        System.out.println((dp[W][H][0][0]+dp[W][H][0][1]+dp[W][H][1][0]+dp[W][H][1][1]) % MOD);
    }
}
