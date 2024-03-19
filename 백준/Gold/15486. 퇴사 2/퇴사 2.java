import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int N;
    private static int[][]arr;
    private static int[] dp;



    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        arr = new int[N][2];
        dp = new int[N+1];

        for(int i = 0 ; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
    }
    public static void process() {
        for(int i = N-1; i>=0; i--){
            int day = arr[i][0];
            int pay = arr[i][1];

            if(day+i <= N){
                dp[i] = Math.max(dp[day+i]+pay , dp[i+1]);
            }else{
                dp[i] = dp[i+1];
            }
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
        System.out.println(dp[0]);
    }
}
