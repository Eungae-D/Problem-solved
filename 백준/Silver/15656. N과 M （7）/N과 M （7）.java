import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int N,M;
    private static int[]arr;
    private static int[]variable;

    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N= Integer.parseInt(st.nextToken());
        M= Integer.parseInt(st.nextToken());

        arr = new int[M];
        variable = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < N; i++){
            variable[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(variable);
    }
    public static void process(){
        recur(0);
    }

    public static void recur(int cur){
        if(cur==M){
            for(int i = 0 ; i < M ; i++){
                sb.append(arr[i]+" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0 ; i < N; i++){
            arr[cur]=variable[i];
            recur(cur+1);
        }

    }
    public static void main(String[] args) throws Exception {
        input();
        process();
        System.out.println(sb);
    }
}
