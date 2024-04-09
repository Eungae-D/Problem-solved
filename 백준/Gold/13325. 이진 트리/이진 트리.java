import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,K,answer;
    private static int[] arr;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        K = Integer.parseInt(br.readLine());
        N = (int)Math.pow(2,K+1)-1;

        arr = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 2; i<=N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }
    public static int dfs(int cur, int h){
        if(h==K){
            answer+=arr[cur];
            return arr[cur];
        }
        int l = dfs(cur*2, h+1);
        int r = dfs(cur*2+1, h+1);

        answer += arr[cur]+Math.abs(l-r);
        return arr[cur]+Math.max(l,r);
    }

    public static void process() {
        dfs(1,0);
        System.out.println(answer);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
