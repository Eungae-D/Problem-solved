import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static class Node implements Comparable<Node> {
        int v;
        int w;
        public Node(int v, int w) {
            this.v = v;
            this.w = w;
        }
        @Override
        public int compareTo(Node n){
            return this.w-n.w;
        }
    }

    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,E,K;
    private static int[] dist;
    private static PriorityQueue<Node> pq;
    private static ArrayList<Node>[] list;



    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        K=Integer.parseInt(br.readLine());

        list = new ArrayList[N+1];
        for(int i=1;i<=N;i++){
            list[i] = new ArrayList<>();
        }

        for(int i=0;i<E;i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list[u].add(new Node(v, w));
        }

        dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        pq = new PriorityQueue<>();
        pq.add(new Node(K, 0));
        dist[K] = 0;
    }
    public static void dijkstra(){
        while (!pq.isEmpty()){
            Node cur = pq.poll();

            if(dist[cur.v] != cur.w) continue;

            for(Node node : list[cur.v]){
                int nxt = node.v;
                int nd = cur.w+node.w;

                if(dist[nxt] > nd){
                    dist[nxt] = nd;
                    pq.add(new Node(nxt, nd));
                }
            }
        }
    }

    public static void process() {
        dijkstra();
        for(int i=1;i<=N;i++) {
            sb.append(dist[i] == Integer.MAX_VALUE ? "INF": dist[i]);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
