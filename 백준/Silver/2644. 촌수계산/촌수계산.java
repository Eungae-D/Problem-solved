import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PrimitiveIterator;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static int start,end;
    private static ArrayList<Integer>[] adj;
    private static boolean[] visited;
    private static int answer = 0;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        M = Integer.parseInt(br.readLine());

        adj = new ArrayList[N+1];
        visited = new boolean[N+1];

        for(int i = 1; i < N+1; i++){
            adj[i] = new ArrayList<>();
        }

        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            int startV = Integer.parseInt(st.nextToken());
            int endV = Integer.parseInt(st.nextToken());

            adj[startV].add(endV);
            adj[endV].add(startV);
        }
    }
    public static void dfs(int cur, int cnt){
        if(cur == end){
            answer = cnt;
            return;
        }

        visited[cur] = true;

        for(int nxt : adj[cur]){
            if(visited[nxt]) continue;
            dfs(nxt,cnt+1);
        }
    }

    public static void process() {
        dfs(start,0);
        System.out.println(answer == 0 ? -1 : answer);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
