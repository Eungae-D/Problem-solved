import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int M;
    private static int MOD = 100000;
    private static int[][] arr;
    private static long[][][][] dp;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        M = Integer.parseInt(st.nextToken());

        arr = new int[N+10][M+10];

        dp = new long[N+10][M+10][3][3];

        for(int i=1; i<=N; i++){
            for(int j=1; j<=M; j++){
                for(int k=0; k<3; k++){
                    for(int l=0; l<3; l++){
                        dp[i][j][k][l] = -1;
                    }
                }
            }
        }
    }
    public static boolean check(int x, int y, int dir, int preDir){
        if(x>N || y>M) return true;

        if(x-1>=1 && y-1>=1){
            if(dir == preDir) return true;
        }
        return false;
    }
    public static long recur(int x, int y, int dir, int preDir){

        if (check(x,y,dir,preDir)) return 0;

        if (x == N && y == M){ return 1;}
        // dp 조건
        if (dp[x][y][dir][preDir] != -1) return dp[x][y][dir][preDir];

        arr[x][y] = dir;
        //남쪽방향
        long south = recur(x+1,y,2,arr[x][y-1]);
        //동쪽방향
        long east = recur(x,y+1,1,arr[x-1][y]);

        arr[x][y] = 0;

        long result = (south+east)%MOD;
        dp[x][y][dir][preDir] = result;
        return dp[x][y][dir][preDir];
    }

    //실행
    public static void process() {
        recur(1,1,0,0);
        System.out.println(dp[1][1][0][0]);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}