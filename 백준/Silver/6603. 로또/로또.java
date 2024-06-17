import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int size;
    private static int[] variables;
    private static int[] arr;


    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = 6;

        while (true){
            st = new StringTokenizer(br.readLine());

            size = Integer.parseInt(st.nextToken());

            if(size == 0) break;

            variables = new int[size];
            arr = new int[N];

            for(int i = 0 ; i < size; i++){
                variables[i] = Integer.parseInt(st.nextToken());
            }

            process();
            sb.append("\n");
        }

    }
    public static void recur(int cur, int start){
        if(cur == N){
            for(int i = 0 ; i < N ; i++){
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start ; i < size ; i++){
            arr[cur] = variables[i];
            recur(cur+1,i+1);
        }
    }

    //실행
    public static void process() {
        recur(0,0);
    }


    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb);
    }
}