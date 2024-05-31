import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static int[][] arr = new int[200][200];
    private static int[][] prefix = new int[200][200];
    private static int answer = Integer.MIN_VALUE;



    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i = 1 ; i <= N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= M ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1 ; i <= N ; i++){
            for(int j = 1; j <= M ; j++){
                prefix[i][j] += arr[i][j]+prefix[i][j-1]+prefix[i-1][j]-prefix[i-1][j-1];
            }
        }
    }

    //실행
    public static void process() {
        for(int x1 = 1 ; x1 <= N ; x1++){
            for(int y1 = 1 ; y1 <= M ; y1++){
                for(int x2 = x1 ; x2 <= N ; x2++){
                    for(int y2 = y1 ; y2 <= M ; y2++){
                        answer=Math.max(answer, prefix[x2][y2] - prefix[x2][y1-1] - prefix[x1-1][y2] + prefix[x1-1][y1-1]);
                    }
                }
            }
        }
        System.out.println(answer);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
