import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static int[][] arr = new int[101][101];
    private static int answer = 0;


    public static void input() throws Exception {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int j = x1;  j <= x2 ; j++){
                for(int k = y1 ; k <= y2 ; k++){
                    arr[j][k]++;
                }
            }
        }
    }

    public static void process() {
        for(int i = 1 ; i <= 100 ; i++){
            for(int j = 1 ; j <= 100 ; j++){
                if(arr[i][j] > M) answer++;
            }
        }
    }


    public static void main(String[] args) throws Exception{
        input();
        process();
        System.out.println(answer);
    }
}
