
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,K;
    private static int[] arr;
    private static int[] dp;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N];
        dp = new int[K+1];

        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    public static void process() {
        dp[0] = 1;
        for(int i = 0 ; i < N; i++){
            for(int j = 1 ; j <= K; j++){
                if(j >= arr[i]){
                    dp[j] +=dp[j-arr[i]];
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
        System.out.println(dp[K]);
    }
}
