import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N, K;
    private static int[][] subjects;
    private static int[][] dp;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        subjects = new int[K][2];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            subjects[i][0] = Integer.parseInt(st.nextToken());
            subjects[i][1] = Integer.parseInt(st.nextToken());
        }

        dp = new int[K+1][N+1];
    }


    //실행
    public static void process() {
        for(int i = K-1; i >= 0 ; i--){
            int importance = subjects[i][0];
            int time = subjects[i][1];

            for(int j = N ; j>=0 ; j--){
                if(j >= time){
                    dp[i][j] = Math.max(dp[i+1][j],dp[i+1][j-time] + importance);
                }else{
                    dp[i][j] = dp[i+1][j];
                }
            }
        }
        System.out.println(dp[0][N]);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}