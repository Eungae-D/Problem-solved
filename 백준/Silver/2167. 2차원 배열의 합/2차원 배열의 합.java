import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int N,M;
    private static int[][] arr;
    private static int K;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N+1][M+1];

        for(int i = 1 ; i <= N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1 ; j <=M ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        K = Integer.parseInt(br.readLine());
        for(int t = 0 ; t < K ; t++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            process(i,j,x,y);
        }
    }

    public static void process(int i, int j, int x, int y){
        int sum = 0;
        for(int x1 = i ; x1 <= x ; x1++){
            for(int y1 = j ; y1 <= y ; y1++){
                sum+=arr[x1][y1];
            }
        }
        sb.append(sum).append("\n");
    }

    public static void main(String[] args) throws Exception{
        input();
        System.out.println(sb);
    }
}
