import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
class roomInfo{
    int node;
    int edge;

    public roomInfo(int node, int edge){
        this.node = node;
        this.edge = edge;
    }
}

public class Main {

    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int start,end;
    private static ArrayList<roomInfo>[] adj;
    private static boolean[] visited;
    private static int answer;
    private static int bigMax = Integer.MIN_VALUE;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        if(N == 1 || start == end){
            System.out.println(0);
            return;
        }

        adj = new ArrayList[N+1];
        visited = new boolean[N+1];

        for(int i = 1 ; i <= N; i++){
            adj[i] = new ArrayList<roomInfo>();

        }

        for(int i = 0; i < N-1; i++){
            st = new StringTokenizer(br.readLine());
            int startV = Integer.parseInt(st.nextToken());
            int endV = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            adj[startV].add(new roomInfo(endV,E));
            adj[endV].add(new roomInfo(startV,E));
        }

        process();
    }

    public static void dfs(int cur, int sum, int max){
        if(cur == end){
            answer = sum;
            bigMax = max;
            return;
        }

        visited[cur] = true;

        for(roomInfo room : adj[cur]){
            if(visited[room.node]) continue;

            dfs(room.node, sum+room.edge,Math.max(max,room.edge));
        }
    }

    public static void process() {
        dfs(start,0,bigMax);
        System.out.println(answer-bigMax);
    }


    public static void main(String[] args) throws Exception {
        input();
    }
}