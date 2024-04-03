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
        public Node (int v, int w){
            this.v = v;
            this.w = w;
        }
        @Override
        public int compareTo(Node o){
            return this.w - o.w;
        }
    }
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M,X;
    private static ArrayList<Node>[] list;
    private static ArrayList<Node>[] reverse_list;
    private static PriorityQueue<Node> que = new PriorityQueue<Node>();
    private static int[]dist; //x에서 정점까지 최단 거리, 내가 간거
    private static int[]reverse_dist; //정점에서 x 까지 최단거리,들어오는것
    private static int ans = Integer.MIN_VALUE;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        X =Integer.parseInt(st.nextToken());

        list= new ArrayList[N+1];
        reverse_list = new ArrayList[N+1];
        for(int i = 1; i <= N; i++){
            list[i] = new ArrayList<>();
            reverse_list[i] = new ArrayList<>();
        }

        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            list[u].add(new Node(v,w));
            reverse_list[v].add(new Node(u,w));
        }

        dist= new int[N+1];
        reverse_dist = new int[N+1];

        Arrays.fill(dist,Integer.MAX_VALUE);
        Arrays.fill(reverse_dist,Integer.MAX_VALUE);

    }
    public static void dijkstra(ArrayList<Node>[] list,int[] dist){
        que.add(new Node(X,0));
        dist[X] = 0;

        while (!que.isEmpty()){
            Node cur = que.poll();

            if(dist[cur.v] < cur.w) continue;

            for(Node node : list[cur.v]){
                int nxt  = node.v;
                int nd = cur.w + node.w;

                if(dist[nxt] > nd){
                    dist[nxt] = nd;
                    que.add(new Node(nxt,nd));
                }
            }
        }
    }

    public static void process() {
        dijkstra(list,dist);
        dijkstra(reverse_list,reverse_dist);

        for(int i = 1 ; i <= N ; i++){
            ans = Math.max(ans,dist[i]+reverse_dist[i]);
        }
        System.out.println(ans);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
