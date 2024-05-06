import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[][]arr;
    private static int rank = 1;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        arr = new int[N][2];
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 2 ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    //실행
    public static void process() {
        for(int i = 0 ; i < N ; i++){
            int weight = arr[i][0];
            int height = arr[i][1];

            for(int j = 0 ; j < N ; j++){
                if(i == j) continue;

                if(weight<arr[j][0] && height < arr[j][1]){
                    rank++;
                }
            }

            sb.append(rank).append(" ");
            rank = 1;
        }

        System.out.println(sb.toString());
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
