import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,R,Q;
    private static List<List<Integer>> v;
    private static int[]par;
    private static int[]size;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());

        v = new ArrayList<>();
        par = new int[N+1];
        size = new int[N+1];

        for(int i = 0 ; i <=N; i++){
            v.add(new ArrayList<>());
        }

        for(int i = 0 ; i < N-1; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            v.get(s).add(e);
            v.get(e).add(s);
        }

        process();

        for(int i = 0 ; i < Q; i++){
            System.out.println(size[Integer.parseInt(br.readLine())]);
        }
    }


    public static void dfs(int cur, int prv){
        size[cur] = 1;
        for(int nxt : v.get(cur)){
            if(nxt == prv) continue;

            par[nxt] = cur;

            dfs(nxt, cur);

            size[cur] += size[nxt];
        }
    }

    public static void process() {
        dfs(R,0);
    }


    public static void main(String[] args) throws Exception {
        input();
    }
}
