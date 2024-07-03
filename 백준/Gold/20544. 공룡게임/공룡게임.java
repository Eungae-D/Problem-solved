import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static long[][][][] dp;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        dp = new long[N+1][4][3][2];

        for(int i = 0 ; i < N+1; i++){
            for(int j = 0 ; j < 4 ; j++){
                for(int k = 0 ; k < 3 ; k++){
                    for(int l = 0 ; l < 2 ; l++){
                        if(i==N && l==1){
                            if(j > 2 || k >= 2) continue;
                            dp[i][j][k][l] = 1;
                        }
                    }
                }
            }
        }
    }

    //실행
    public static void process() {
        for(int i = N-1 ; i>= 1 ; i--){
            for(int j = 2 ; j >= 0 ; j--){
                for(int k = 1 ; k >= 0 ; k--){
                    for(int l = 1 ; l >= 0 ; l--){
                        dp[i][j][k][l] = (dp[i+1][0][0][l] + dp[i+1][j+1][0][l]+dp[i+1][j+1][k+1][1]) % 1000000007;
                    }
                }
            }
        }
        System.out.println(dp[1][0][0][0]);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();

    }
}