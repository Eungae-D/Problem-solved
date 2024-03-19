import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,K;
    private static int[] W;
    private static int[] V;
    private static int[][] dp;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        W = new int[N+1];
        V = new int[N+1];
        dp = new int[N+1][K+1];

        for(int i = 1; i <=N; i++){
            st = new StringTokenizer(br.readLine());
            W[i] = Integer.parseInt(st.nextToken());
            V[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void process() {
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= K; j++){

                if(W[i] > j){
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-W[i]]+V[i]);
                }
            }
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
        System.out.println(dp[N][K]);
    }
}
