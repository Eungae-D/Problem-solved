import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static class Node{
        int v;
        int w;
        public Node(int v, int w){
            this.v = v;
            this.w = w;
        }
    }
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static List<Node>[] v;
    private static int max = -1;
    private static int idx = 0;



    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        v = new ArrayList[N+1];

        for(int i = 0 ; i <= N; i++){
            v[i] = new ArrayList<>();
        }

        for(int i = 0 ; i < N-1; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            v[s].add(new Node(e,w));
            v[e].add(new Node(s,w));
        }
    }
    public static void dfs(int cur, int prv,int cnt){
        if(max<cnt){
            max = cnt;
            idx = cur;
        }

        for(Node node : v[cur]){
            if(node.v == prv) continue;

            dfs(node.v,cur, cnt+node.w);
        }
    }

    public static void process() {
        dfs(1,0,0);
        dfs(idx,0,0);
        System.out.println(max);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}