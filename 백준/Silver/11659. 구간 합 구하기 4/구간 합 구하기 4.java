import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static int[]arr, prefix;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N+1];
        prefix = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            prefix[i] = prefix[i-1]+arr[i];
        }

        for(int tc = 0 ; tc < M ; tc++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            process(i,j);
        }

    }

    //실행
    public static void process(int i, int j) {
        sb.append(prefix[j]-prefix[i-1]).append("\n");
    }


    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb.toString());
    }
}
