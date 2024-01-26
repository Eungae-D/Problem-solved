import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int n,max;
    private static int[] arr;
    private static int[] dp;

    public static void input() throws Exception{
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        dp = new int[n];

        for(int i = 0 ; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0];

        for(int i = 1; i<n; i++){
            dp[i] = Math.max(dp[i-1]+arr[i],arr[i]);
        }

        max = Integer.MIN_VALUE;


    }

    public static void process(){
        for(int i = 0 ; i < dp.length; i++){
            max = Math.max(max,dp[i]);
        }
        System.out.println(max);
    }


    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
