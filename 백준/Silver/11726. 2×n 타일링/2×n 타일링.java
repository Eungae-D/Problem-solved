import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[]dp;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        dp = new int[N+1];

        if(N == 1){
            System.out.println(1);
            return;
        }
        dp[1] = 1;
        dp[2] = 2;

    }

    public static void process() {
        for(int i = 3; i <=N; i++){
            dp[i] = (dp[i-1]+dp[i-2])%10007;
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        if(N==1){
            return;
        }
        process();
        System.out.println(dp[N]);
    }
}
