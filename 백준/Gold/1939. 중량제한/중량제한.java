import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static class Node implements Comparable<Node>{
        int v;
        int w;
        public Node(int v, int w){
            this.v = v;
            this.w = w;
        }

        //거리 기준 내림차순
        @Override
        public int compareTo(Node o){
            return o.w-this.w;
        }
    }
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static ArrayList<Node>[] adj;
    private static int[] dist;
    private static PriorityQueue<Node> pq;
    private static int start,end;
    public static void dijkstra(){
        while (!pq.isEmpty()){
            Node cur = pq.poll();

            if(dist[cur.v] > cur.w) continue;

            for(Node node : adj[cur.v]){
                int nxt = node.v;
                int nd = Math.min(node.w,cur.w);

                if(dist[nxt] < nd){
                    dist[nxt] = nd;
                    pq.add(new Node(nxt,nd));
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        adj = new ArrayList[N+1];
        for(int i = 0 ; i <= N ; i++){
            adj[i] = new ArrayList<>();
        }

        dist = new int[N+1];
        Arrays.fill(dist,-1);

        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            adj[u].add(new Node(v,w));
            adj[v].add(new Node(u,w));
        }

        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        pq = new PriorityQueue<>();
        pq.add(new Node(start,Integer.MAX_VALUE));
        dist[start] = Integer.MAX_VALUE;

        dijkstra();
        System.out.println(dist[end]);
    }
}