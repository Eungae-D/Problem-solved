import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class Node{
    int x;
    int y;

    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static int[][] arr;
    private static boolean[][] visited;
    private static Queue<Node> que = new LinkedList<>();
    private static int[] dx = {1,-1,0,0};
    private static int[] dy = {0,0,1,-1};
    private static int answer = 1;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0 ; i < N ; i++){
            String line = br.readLine();
            for(int j = 0 ; j < M ; j++){
                arr[i][j] = line.charAt(j)-'0';
                if(arr[i][j] == 0){
                    visited[i][j] = true;
                }
            }
        }
    }
    public static void bfs(){
        que.add(new Node(0,0));
        visited[0][0] = true;


        while(!que.isEmpty()){
            int sz = que.size();

            for(int s = 0 ; s<sz; s++){
                Node node = que.poll();
                int curX = node.x;
                int curY = node.y;

                if(curX == N-1 && curY ==M-1){
                    System.out.println(answer);
                    return;
                }

                for(int i = 0 ; i < 4; i++){
                    int dr = curX + dx[i];
                    int dc = curY + dy[i];

                    if(dr >= 0 && dc >= 0 && dr<N && dc<M ){
                        if(visited[dr][dc] ||arr[dr][dc] == 0) continue;

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
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
