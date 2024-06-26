import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[][] arr;
    private static int[][] dp;
    private static int answer = Integer.MAX_VALUE;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        arr = new int[N][3];
        dp = new int[N][3];

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 3; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }
    }
    public static int recur(int cur, int prev){
        if(cur == N) return 0;

        if(dp[cur][prev] != -1) return dp[cur][prev];

        int ret = Integer.MAX_VALUE;

        for(int i = 0 ; i < 3 ; i++){
            if(i==prev) continue;

            ret = Math.min(ret, recur(cur+1,i)+arr[cur][i]);
        }

        dp[cur][prev] = ret;
        return ret;
    }

    //실행
    public static void process() {
        for(int i = 0; i < 3; i++){
            answer = Math.min(answer, recur(0, i));
        }
        System.out.println(answer);

    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}