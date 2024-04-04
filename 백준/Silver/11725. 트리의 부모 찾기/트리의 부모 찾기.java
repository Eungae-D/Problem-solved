import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int N;
    private static List<List<Integer>> v;
    private static int[]par;

    public static void input () throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        v = new ArrayList<>();
        par = new int[N+1];

        for(int i = 0 ; i <= N; i++){
            v.add(new ArrayList<>());
        }

        for(int i = 0 ; i < N-1; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            v.get(s).add(e);
            v.get(e).add(s);
        }

    }
    public static void dfs(int cur, int prv){
        for(int nxt : v.get(cur)){
            if(nxt == prv) continue;

            par[nxt] = cur;
            dfs(nxt,cur);
        }
    }
    public static void process(){
        dfs(1,0);
        for(int i = 2; i <= N; i++){
            System.out.println(par[i]);
        }
    }
    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
