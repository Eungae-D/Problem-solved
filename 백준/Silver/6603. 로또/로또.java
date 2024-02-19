import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int[]arr;
    private static int[]ans;
    private static int tc;
    private static int N;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = 6;

        while (true){
            st = new StringTokenizer(br.readLine());

            tc = Integer.parseInt(st.nextToken());

            if(tc==0){
                break;
            }

            arr= new int[tc];
            ans = new int[N];

            for(int i = 0 ; i < tc; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            process();
            sb.append("\n");
        }
    }

    public static void process(){
        recur(0,0);
    }

    public static void recur(int cur, int start){
        if(cur==N){
            for(int i = 0; i < N ; i++){
                sb.append(ans[i]+" ");
            }
            sb.append("\n");
            return;
        }

        for(int i  = start; i< tc; i++){
            ans[cur] = arr[i];
            recur(cur+1,i+1);
        }
    }



    public static void main(String[] args) throws Exception{
        input();
        System.out.println(sb);
    }
}
