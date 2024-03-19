import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[]arr;
    private static int[]dp;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();


        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        dp = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i <N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void process() {
        for(int i = 0 ; i < N; i++){
            dp[i] = 1;

            for(int j = 0 ; j < i; j++){
                if(arr[j] < arr[i] && dp[i] < dp[j]+1){
                    dp[i] = dp[j]+1;
                }
            }
        }
        int max = -1;
        for(int i = 0 ; i < N ; i++){
            if(dp[i]>max){
                max = dp[i];
            }
        }
        System.out.println(max);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
