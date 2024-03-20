import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[][] arr;
    private static int[] dp;
    private static int max = Integer.MIN_VALUE;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        arr = new int[N][2];
        dp = new int[N];

        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
    }

    public static void process() {
        for(int i = 0 ; i < N; i++){
            dp[i] = 1;
            for(int j = 0 ; j < i ; j++){
                if(arr[i][1] > arr[j][1]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }

        for(int i = 0 ; i < N ; i++){
            max = Math.max(max, dp[i]);
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
        System.out.println(N-max);
    }
}
