import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static class Node {
        int x;
        int y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int M,N;
    private static int[][] arr;
    private static boolean[][] visited;
    private static Queue<Node> que = new LinkedList<>();
    private static int answer = 0;
    private static int[]dx = {1,-1,0,0};
    private static int[]dy = {0,0,1,-1};


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < M ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1){
                    que.add(new Node(i,j));
                    visited[i][j] = true;
                } else if (arr[i][j] == -1) {
                    visited[i][j] = true;
                }
            }
        }
    }
    public static void bfs(){
        while (!que.isEmpty()){
            int sz = que.size();

            for(int s = 0 ; s<sz; s++){
                Node node = que.poll();
                int curX = node.x;
                int curY = node.y;

                for(int i = 0 ; i < 4; i++){
                    int dr = curX+dx[i];
                    int dc = curY+dy[i];

                    if(dr>=0 && dc>=0 && dr<N && dc<M){
                        if(visited[dr][dc] || arr[dr][dc] == -1) continue;

                        que.add(new Node(dr,dc));
                        visited[dr][dc] = true;
                    }
                }
            }
            answer++;
        }
    }

    public static void process() {
        bfs();

        for(int i = 0 ; i < N; i++){
            for(int j = 0 ; j < M ; j++){
                if(visited[i][j]==false){
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(answer-1);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
