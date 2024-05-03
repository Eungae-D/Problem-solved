import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[]dp;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        dp = new int[N+1];
    }

    //실행
    public static void process() {
        if(N >= 3) dp[3] = 1;

        if(N >= 5) dp[5] = 1;

        for(int  i = 6 ; i <= N ; i++){
            if(i % 5 == 0){
                dp[i] = dp[i-5]+1;
            }else if(i % 3 == 0){
                dp[i] = dp[i-3]+1;
            }else{
                if(dp[i-3] != 0 && dp[i-5] != 0){
                    dp[i] = Math.min(dp[i-3],dp[i-5]) + 1;
                }
            }
        }
        System.out.println(dp[N] == 0 ? -1 : dp[N]);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
