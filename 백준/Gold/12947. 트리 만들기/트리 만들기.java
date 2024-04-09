import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[] cnt;
    private static int pre = 0 ,max = 0;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        cnt = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            cnt[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void process() {
        for(int i = 1; i<= N; i++){
            pre++;
            if(cnt[i] ==1){
                pre = Math.max(pre,max+1);
                max = 0;
            }else{
                max +=2;
            }
        }

        System.out.println(Math.max(pre,max));
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
