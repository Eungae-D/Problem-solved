import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,K;
    private static int idx;
    private static int[] arr;
    private static boolean flag;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
    }
    public static void recur(int sum, String line){
        if(sum == N){
            idx++;
            if(idx == K){
                sb.append(line);
                flag = true;
            }
            return;
        }
        for(int i = 1 ; i <=3 ; i++){
            if(sum+i<=N){
                recur(sum+i,line.isEmpty() ? ""+i : line+"+"+i);
            }
        }
    }

    //실행
    public static void process() {
        recur(0,"");
        if(!flag){
            System.out.println(-1);
        }else{
            System.out.println(sb);
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}