import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 2번 템플릿 응용
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int N;
    private static int max;
    private static int[] arr;
    private static int[] ans;
    private static boolean[] visited;
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N=  Integer.parseInt(st.nextToken());

        arr = new int[N];
        ans = new int[N];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        max = Integer.MIN_VALUE;
    }

    public static void process() {
        recur(0);
        System.out.println(max);
    }

    public static void recur(int cur){
        if(cur==N){
            int sum = 0;
            for(int i = 0 ; i < N-1; i++){
                sum +=Math.abs(ans[i]-ans[i+1]);
            }
            max = Math.max(max,sum);
            return;
        }
        for(int i = 0 ; i < N;i++){
            if(visited[i]) continue;
            visited[i] = true;
            ans[cur] = arr[i];
            recur(cur+1);
            visited[i] = false;
        }

    }

    public static void main(String[] args) throws Exception{
        input();
        process();
        System.out.println(sb);
    }
}
