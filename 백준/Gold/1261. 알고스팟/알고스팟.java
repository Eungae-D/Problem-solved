import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PrimitiveIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static class Node implements Comparable<Node>{
        int x;
        int y;
        int cnt;
        public Node(int x, int y, int cnt){
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }

        @Override
        public int compareTo(Node o){
            return this.cnt-o.cnt;
        }
    }
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static int[][]arr;
    private static boolean[][]visited;
    private static int[] dx = {1,-1,0,0};
    private static int[] dy = {0,0,1,-1};
    private static Queue<Node> que = new PriorityQueue<>();


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0 ; i < N ; i++){
            String line = br.readLine();
            for(int j = 0 ; j < M ; j++){
                arr[i][j] = line.charAt(j)-'0';
            }
        }
    }
    public static void bfs(){
        que.add(new Node(0,0,0));
        visited[0][0] = true;

        while (!que.isEmpty()){
            int size = que.size();

            for(int s = 0 ; s < size ; s++){
                Node node = que.poll();

                if(node.x == N-1 && node.y == M-1){
                    System.out.println(node.cnt);
                    return;
                }

                for(int i = 0 ; i < 4 ; i++){
                    int dr = node.x + dx[i];
                    int dc = node.y + dy[i];

                    if(dr<0 || dc<0 || dr>=N || dc >=M) continue;

                    if(visited[dr][dc]) continue;

                    visited[dr][dc] = true;
                    if(arr[dr][dc]==0){
                        que.add(new Node(dr,dc,node.cnt));
                    }else{
                        que.add(new Node(dr,dc, node.cnt+1));
                    }
                }
            }
        }
    }

    public static void process() {
        bfs();
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
