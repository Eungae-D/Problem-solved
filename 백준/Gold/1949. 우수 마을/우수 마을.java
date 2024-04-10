import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;

    private static int[] arr;
    private static int[][] dp;
    private static List<List<Integer>> v;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        arr = new int[N+1];
        dp = new int[N+1][2];

        v = new ArrayList<>();
        for(int i = 0 ; i <= N; i++){
            v.add(new ArrayList<>());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0 ; i < N -1 ; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            v.get(s).add(e);
            v.get(e).add(s);
        }
    }
    public static void dfs(int cur, int prv){
        for(int nxt : v.get(cur)){
            if( nxt == prv) continue;

            dfs(nxt, cur);
            dp[cur][0] += Math.max(dp[nxt][0],dp[nxt][1]);
            dp[cur][1] += dp[nxt][0];
        }

        dp[cur][1] += arr[cur];
    }

    public static void process() {
        dfs(1,0);
        System.out.println(Math.max(dp[1][0],dp[1][1]));
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
