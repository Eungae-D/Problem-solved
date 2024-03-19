import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[] arr;
    private static int[] dp;



    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N= Integer.parseInt(br.readLine());

        arr = new int[N+1];
        dp = new int[N+1];

        for(int i = 1 ; i <= N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    public static void process() {
        dp[1] = arr[1];

        if(N >=2 ){
            dp[2] = arr[1]+arr[2];
        }

        for(int i = 3; i <= N; i++){
            dp[i] = Math.max(dp[i-2],dp[i-3]+arr[i-1])+arr[i];
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
        System.out.println(dp[N]);
    }
}
