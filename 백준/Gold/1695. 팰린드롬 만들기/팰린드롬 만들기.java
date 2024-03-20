import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[] arr;
    private static int[][] dp;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        arr = new int[N+1];
        dp = new int[N+1][N+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i <N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void process() {
        for(int i = 1; i <= N ; i++){
            for(int j = 1; j <= N ; j++){
                if(arr[N-i] == arr[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
        System.out.println(N-dp[N][N]);
    }
}
