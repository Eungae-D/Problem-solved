import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static int[] variables;
    private static int[] arr;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        variables = new int[N];
        arr = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            variables[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(variables);
    }
    public static void recur(int cur, int start){
        if(cur == M){
            for(int i = 0 ; i < M ; i++){
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }


        for(int i = start ; i < N; i++){
            arr[cur] = variables[i];
            recur(cur+1, i+1);
        }
    }

    //실행
    public static void process() {
        recur(0,0);
        System.out.println(sb);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}