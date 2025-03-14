

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int N,M,A,MAX;
    private static int[][]arr;
    private static int[]prefix;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        prefix = new int[M+1];

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < M ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0 ; i < M ; i++){
            for(int j = 0 ; j < N ; j++){
                prefix[i+1] += arr[j][i];
            }
            prefix[i+1] += prefix[i];
        }

        A = Integer.parseInt(br.readLine());
    }

    public static void process(){
        for(int i = A ; i<= M ; i++){
            int t = prefix[i]-prefix[i-A];
            if(t>MAX){
                MAX = t;
            }

        }
        System.out.println(MAX);
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
