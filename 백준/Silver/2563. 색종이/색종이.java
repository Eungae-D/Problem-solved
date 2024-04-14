import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[][]arr = new int[110][110];
    private static int answer = 0;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            process(x,y);
        }
    }

    //실행
    public static void process(int x, int y) {
        for(int i = x ; i < x+10 ; i++){
            for(int j = y ; j < y+10 ; j++){
                if(arr[i][j] == 0 ){
                    arr[i][j] = 1;
                    answer++;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        input();
        System.out.println(answer);
    }
}
