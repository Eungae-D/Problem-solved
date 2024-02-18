import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int N, M;
    private static int[] arr;



    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); //자연수 범위
        M = Integer.parseInt(st.nextToken()); //반복문 갯수

        arr = new int[M];




    }

    public static void process(){
        recur(0);
    }

    public static void recur(int cur){
        if(cur ==M){
            for(int i = 0 ; i < M;i++){
                sb.append(arr[i]+" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 0 ; i < N ; i++){
            arr[cur] = i+1;
            recur(cur+1);
        }

    }



    public static void main(String[] args) throws Exception{
        input();
        process();
        System.out.println(sb);
    }
}
