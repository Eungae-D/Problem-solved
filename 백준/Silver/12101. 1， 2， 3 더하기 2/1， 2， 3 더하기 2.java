import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int N,K;
    private static int idx = 0;
    private static boolean flag = false;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());


    }

    public static void process() {
        recur(0,"");
    }

    public static void recur(int sum, String line){
        //1번 템플릿 활용 (중복 순열)
        if(sum==N){
            idx++;
            if(idx==K){
                sb.append(line);
                flag = true;
            }
            return;
        }

        for(int i = 1; i <= 3; i++){
            if(sum+i<=N){
                recur(sum+i,line.isEmpty() ? ""+i : line +"+"+i);
            }

        }
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
        if(!flag){
            System.out.println(-1);
        }else{
            System.out.println(sb);
        }
    }
}
