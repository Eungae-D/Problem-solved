import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static class Node implements Comparable<Node> {
        int v;
        int w;

        Node(int v, int w){
            this.v = v;
            this.w = w;
        }
        @Override
        public int compareTo(Node o) {
            return this.w - o.w;
        }
    }
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static ArrayList<Node>[] list;
    private static PriorityQueue<Node> que = new PriorityQueue<>();
    private static int[] dist;
    private static int[] info;
    private static int count = 0;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        list = new ArrayList[N+1];
        dist = new int[N+1];
        info = new int[N+1];


        for(int i = 1 ; i <=N ; i++){
            list[i] = new ArrayList<>();
        }

        for(int i = 1;  i <= M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            list[u].add(new Node(v,w));
            list[v].add(new Node(u,w));
        }

        Arrays.fill(dist, Integer.MAX_VALUE);
    }
    public static void dijkstra(){
        que.add(new Node(1,0));
        dist[1] = 0;

        while (!que.isEmpty()){
            Node cur = que.poll();

            if(dist[cur.v] < cur.w) continue;

            for(Node node : list[cur.v]){
                int nxt = node.v;
                int nd = cur.w + node.w;

                if(dist[nxt] > nd){
                    dist[nxt] = nd;
                    info[nxt] = cur.v;
                    que.add(new Node(nxt,nd));
//                    System.out.println(nxt+" "+nd);
                    }
                }
        }
    }

    public static void process() {
        dijkstra();
        for(int i = 2;  i <= N ; i++){
            if(info[i]==0) continue;
//            System.out.println(Arrays.toString(info));
            count++;
            sb.append(i+" "+info[i]).append("\n");
        }
        System.out.println(count);
        System.out.println(sb.toString());
//        System.out.println(Arrays.toString(dist));
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}