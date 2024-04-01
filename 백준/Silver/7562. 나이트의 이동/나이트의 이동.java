import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static class Node{
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
    private static int T;
    private static int N;
    private static int[][] arr;
    private static boolean[][] visited;
    private static int[] dx = {1,2,2,1,-1,-2,-2,-1};
    private static int[] dy = {2,1,-1,-2,-2,-1,1,2};
    private static Queue<Node> que;
    private static int answer;
    private static int startX,startY;
    private static int endX,endY;



    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());

        for(int tc = 0 ; tc < T ; tc++){

            answer = 0;
            N = Integer.parseInt(br.readLine());

            arr= new int[N][N];
            visited = new boolean[N][N];

            st = new StringTokenizer(br.readLine());
            startX = Integer.parseInt(st.nextToken());
            startY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            endX = Integer.parseInt(st.nextToken());
            endY = Integer.parseInt(st.nextToken());

            process();
        }
    }
    public static void bfs(){
        que = new LinkedList<>();
        que.add(new Node(startX,startY));
        visited[startX][startY] = true;

        while (!que.isEmpty()){
            int sz = que.size();

            for(int s = 0 ; s<sz; s++) {
                Node node = que.poll();
                int curX = node.x;
                int curY = node.y;

                if (curX == endX && curY == endY) {
                    System.out.println(answer);
                    return;
                }

                for (int i = 0; i < 8; i++) {
                    int dr = curX + dx[i];
                    int dc = curY + dy[i];

                    if (dr >= 0 && dc >= 0 && dr < N && dc < N) {
                        if (visited[dr][dc]) continue;

                        que.add(new Node(dr, dc));
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
    }
}
