import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int[][][] dp = new int[501][501][2];
    private static int[] moves = new int[3];
    private static int K1,K2;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < 3 ; i++){
            moves[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i <= 500; i++) {
            for (int j = 0; j <= 500; j++) {
                dp[i][j][0] = -1; // A의 승리 여부 초기화
                dp[i][j][1] = -1; // B의 승리 여부 초기화
            }
        }

        for(int tc = 0 ; tc < 5 ; tc++){

            st = new StringTokenizer(br.readLine());
            K1 = Integer.parseInt(st.nextToken());
            K2 = Integer.parseInt(st.nextToken());
            process();
        }
    }
    public static int recur(int k1, int k2, int turn){
        if(K1 < 0 || K2 < 0) return 0;
        if(dp[k1][k2][turn] != -1) return dp[k1][k2][turn];

        boolean canWin = false;
        for(int move : moves){
            if(turn == 0){ //A 차례
                if(k1-move >= 0 && recur(k1-move, k2, 1-turn) == 0){
                    canWin = true;
                }
                if(k2-move >= 0 && recur(k1, k2-move,1-turn)==0){
                    canWin = true;
                }
            }else{ //B 차례
                if (k1 - move >= 0 && recur(k1 - move, k2, 1 - turn) == 0) {
                    canWin = true;
                }
                if (k2 - move >= 0 && recur(k1, k2 - move, 1 - turn) == 0) {
                    canWin = true;
                }
            }
        }

        dp[k1][k2][turn] = canWin ? 1 : 0;
        return dp[k1][k2][turn];
    }

    //실행
    public static void process() {
        if (recur(K1, K2, 0) == 1) {
            sb.append("A\n");
        } else {
            sb.append("B\n");
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb);
    }
}