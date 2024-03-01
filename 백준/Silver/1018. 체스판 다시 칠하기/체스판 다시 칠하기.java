import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static boolean[][]arr;
    private static int answer = Integer.MAX_VALUE;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        for(int i = 0 ; i < N ; i++){
            String line = br.readLine();
            for(int j = 0 ; j < M ; j++){
                if(line.charAt(j) == 'W'){
                    arr[i][j] = true;
                }else{
                    arr[i][j] = false;
                }
            }
        }
    }
    public static void find(int x, int y){
        boolean start = arr[x][y];
        
        int cnt = 0;

        for(int i = x ; i < x+8; i++){
            for(int j = y ; j < y+8; j++){
                if(arr[i][j]!=start){
                    cnt++;
                }
                start = (!start);
            }
            start = (!start);
        }
        cnt = Math.min(cnt,64-cnt);
        answer = Math.min(answer,cnt);
    }

    public static void process() {
        for(int i = 0 ; i < N-7 ; i++){
            for(int j = 0 ; j < M-7 ; j++){
                find(i,j);
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
