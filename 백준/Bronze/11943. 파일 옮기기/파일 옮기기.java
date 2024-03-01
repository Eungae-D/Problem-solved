import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int[][] arr = new int[2][2];
    private static int first;
    private static int second;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        for(int i = 0 ; i < 2; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 2; j ++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    public static void process() {
        first = arr[0][0] + arr[1][1];
        second = arr[0][1] + arr[1][0];
        System.out.println(Math.min(first,second));
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
