import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,K;
    private static int[] A;
    private static int[][] rang;
    private static int[][] merry;
    private static int max = Integer.MIN_VALUE;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        A = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        rang = new int[K][N];
        merry = new int[K][N];

        for(int i = 0 ; i < K ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < N ; j++){
                rang[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0 ; i < K ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < N ; j++){
                merry[i][j] = Integer.parseInt(st.nextToken());
            }
        }

    }
    public static void recur(int cur, int r, int m){
        if(cur == K){
            max = Math.max(max, r+m);
            return;
        }

        for(int i = 0 ; i < N ; i++){
            int happyRang = r;
            int happyMerry = m;
            if(A[i]>0){
                A[i]--;
                happyRang += rang[cur][i];
                for(int j = 0 ; j < N ; j++){
                    if(A[j]>0){
                        A[j]--;
                        happyMerry += merry[cur][j];
                        recur(cur+1,happyRang,happyMerry);
                        happyMerry -= merry[cur][j];
                        A[j]++;
                    }
                }
                happyRang -= rang[cur][i];
                A[i]++;
            }
        }
    }

    //실행
    public static void process() {
        recur(0,0,0);
        System.out.println(max);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}