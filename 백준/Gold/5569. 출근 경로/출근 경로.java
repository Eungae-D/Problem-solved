import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static int MOD = 100000;
    private static int[][] arr;
    private static long [][][][]dp;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        M = Integer.parseInt(st.nextToken());

        dp = new long[N + 1][M + 1][2][2];
        //0이 아래방향 1이 오른쪽
        //0 안바꿈 1이 바꿈
        for(int j = 1 ; j <= N ; j++){
            dp[j][1][0][0] = 1;
        }

        for(int i = 1; i <= M ; i++){
            dp[1][i][1][0] = 1;
        }

    }

    //실행
    public static void process() {
        for(int x = 2; x <= N; x++){
            for(int y = 2 ; y<= M ; y++){
                dp[x][y][0][0] = (dp[x-1][y][0][0]+dp[x-1][y][0][1])%100000;
                dp[x][y][0][1] = dp[x-1][y][1][0];
                dp[x][y][1][0] = (dp[x][y-1][1][0]+dp[x][y-1][1][1])%100000;
                dp[x][y][1][1]=  dp[x][y-1][0][0];
            }
        }
        int ans = 0;
        for(int i=0;i<2;i++) for(int j=0;j<2;j++) ans += dp[N][M][i][j];
        System.out.println(ans%100000);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}