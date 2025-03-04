import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int N;
    private static int[]arr, prefix;
    private static long answer;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());

        arr = new int[N+1];
        prefix = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            prefix[i] = arr[i]+prefix[i-1];
        }
    }

    public static void process(){
        for(int i = 1 ; i < N ; i++){
            answer+= (prefix[N]-prefix[i])*arr[i];
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
        System.out.println(answer);
    }
}
