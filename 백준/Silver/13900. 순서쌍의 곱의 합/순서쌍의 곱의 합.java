import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int N;
    private static long[] arr, prefix;
    private static long answer;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        arr = new long[N+1];
        prefix = new long[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= N ; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }
    }

    public static void process(){
        for(int i = 1 ; i <= N; i++){
            prefix[i] = prefix[i-1]+arr[i];
            answer+= prefix[i-1]*arr[i];
        }
        System.out.println(answer);

    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
