import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int T,W;
    private static int[] arr;
    private static int[][][] dp;
    private static int max = Integer.MIN_VALUE;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        T = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());

        arr = new int[T+1];
        dp = new int[T+1][W+1][3];

        for(int i = 1 ; i <= T; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        if(arr[1]==2){
            dp[1][0][1] = 0;
            dp[1][1][2] = 1;
        }else{
            dp[1][0][1] = 1;
            dp[1][1][2] = 0;
        }


    }

    public static void process() {
        for(int i = 2; i<=T; i++){

            if(arr[i] == 1){
                dp[i][0][1] = dp[i-1][0][1] + 1;
                dp[i][0][2] = dp[i-1][0][2];

                for(int j = 1; j<=W; j++){
                    dp[i][j][1] = Math.max(dp[i-1][j][1], dp[i-1][j-1][2])+ 1;
                    dp[i][j][2] = Math.max(dp[j-1][j-1][1], dp[i-1][j][2]);
                }
            }
            else{
                dp[i][0][1] = dp[i-1][0][1];
                dp[i][0][2] = dp[i-1][0][2] + 1;

                for(int j = 1; j<=W; j++){
                    dp[i][j][1] = Math.max(dp[i-1][j][1], dp[i-1][j-1][2]);
                    dp[i][j][2] = Math.max(dp[i-1][j-1][1], dp[i-1][j][2]) + 1;
                }
            }

        }

        for(int w = 0; w<=W; w++){
            max = Math.max(max, Math.max(dp[T][w][1], dp[T][w][2]));
        }
    }



    public static void main(String[] args) throws Exception {
        input();
        process();
        System.out.println(max);
    }
}
