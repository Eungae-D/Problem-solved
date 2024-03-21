import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static ArrayList<Integer>[] adj;
    private static boolean[] visited;
    private static int n,e;
    private static int ans = 0;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        e = Integer.parseInt(br.readLine());

        adj = new ArrayList[n+1];
        visited = new boolean[n+1];

        for(int i = 1 ; i < n+1; i++){
            adj[i] = new ArrayList<>();
        }

        for(int i = 0 ; i < e; i++){
            st = new StringTokenizer(br.readLine());

            int startV = Integer.parseInt(st.nextToken());
            int endV = Integer.parseInt(st.nextToken());

            adj[startV].add(endV);
            adj[endV].add(startV);
        }
    }

    public static void dfs(int cur){
        visited[cur] = true;

        ans += 1;

        for(int nxt : adj[cur]){
            if(visited[nxt]) continue;

            dfs(nxt);
        }
    }

    public static void process() {
        dfs(1);
        System.out.println(ans-1);
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
