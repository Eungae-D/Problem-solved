import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static class Node implements Comparable<Node> {
        int x;
        int y;
        int w;
        Node(int x, int y, int w) {
            this.x = x;
            this.y = y;
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
    private static int N;
    private static int[][]arr;
    private static int[][]dijkstra;
    private static int[]dx = {1,-1,0,0};
    private static int[]dy = {0,0,1,-1};
    private static int count = 0;
    private static int answer = 0;
    private static PriorityQueue<Node> que;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();


        String line = null;

        while(!(line = br.readLine()).equals("0")){
            N = Integer.parseInt(line);

            arr = new int[N][N];

            dijkstra = new int[N][N];
            for(int i = 0 ; i < N; i++){
                Arrays.fill(dijkstra[i], Integer.MAX_VALUE);
            }

            for(int i = 0 ; i < N ; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0 ; j < N ; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            count++;
            process();
        }
        System.out.println(sb.toString());
    }

    public static void bfs(){
        que = new PriorityQueue<>();
        que.add(new Node(0,0,arr[0][0]));
        dijkstra[0][0] = arr[0][0];

        while (!que.isEmpty()){
            Node node = que.poll();

            if(node.x == N-1 && node.y ==N-1){
                answer = node.w;
                return;
            }

            for(int i = 0 ; i < 4;  i++){
                int dr = node.x + dx[i];
                int dc = node.y + dy[i];

                if(dr<0 || dc<0 || dr >= N || dc >= N) continue;

                if(node.w + arr[dr][dc] < dijkstra[dr][dc]){
                    dijkstra[dr][dc] = node.w+arr[dr][dc];
                    que.add(new Node(dr,dc,dijkstra[dr][dc]));
                }
            }
        }
    }


    public static void process() {
        answer = 0;
        bfs();
        sb.append("Problem "+count+": "+dijkstra[N-1][N-1]+"\n");
    }


    public static void main(String[] args) throws Exception {
        input();
    }
}
