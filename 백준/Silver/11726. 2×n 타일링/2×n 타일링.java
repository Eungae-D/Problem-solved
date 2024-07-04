import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[] dp;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        dp = new int[N+1];
    }

    //실행
    public static void process() {
        if(N == 1){
            System.out.println(1);
            return;
        }
        
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= N ; i++){
            dp[i] = (dp[i-2]+ dp[i-1])%10007;
        }
        System.out.println(dp[N]);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}