import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[][] arr;
    private static int result = Integer.MAX_VALUE;

    public static void input() throws Exception {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));


        N = Integer.parseInt(br.readLine());
        arr = new int[N][3];


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    public static void process() {
        for (int i = 0; i < N; i++) {
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    int d1 = Math.abs(arr[i][0] - arr[j][0]) + Math.abs(arr[i][1] - arr[j][1])
                            + Math.abs(arr[i][2] - arr[j][2]);

                    if (min1 > d1) {
                        min2 = min1;
                        min1 = d1;
                    } else if (min2 > d1) {
                        min2 = d1;
                    }
                }
            }
            result = Math.min(min1 + min2, result);
        }

        sb.append(result).append("\n");
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
        System.out.print(sb.toString());
    }
}
