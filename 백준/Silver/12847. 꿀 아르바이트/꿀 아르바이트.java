import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int N,M;
    private static int[] arr;
    private static long[] prefix;
    private static long answer = 0;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N+1];
        prefix = new long[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1 ; i <= N ; i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
    }

    public static void process(){
        for(int i = M ; i <= N ; i++){
            long ans = prefix[i] - prefix[i-M];
            answer = Math.max(answer,ans);
        }
        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
