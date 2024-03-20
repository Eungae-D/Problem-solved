import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int T,N,K;
    private static int[][][] dp;



    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());

        dp = new int[101][101][2];
        dp[1][0][0] = 1;
        dp[1][0][1] = 1;

        for(int i = 0; i < 101; i++){
            for(int j = 2 ; j < 101; j++){
                dp[j][i][1] += dp[j-1][i][0];

                if(i != 0){
                    dp[j][i][1] += dp[j-1][i-1][1];
                }
                dp[j][i][0] +=dp[j-1][i][0] + dp[j-1][i][1];
            }
        }

        for(int i = 0 ; i < T ; i++){
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            process();
        }


    }

    public static void process() {
        sb.append(dp[N][K][0]+dp[N][K][1]).append("\n");
    }


    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb);
    }
}
