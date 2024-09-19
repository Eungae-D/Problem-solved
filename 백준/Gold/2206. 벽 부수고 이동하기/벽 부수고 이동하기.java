import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static class Node{
        int x;
        int y;
        int cnt;
        boolean destroyed;
        public Node(int x, int y, int cnt, boolean destroyed) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.destroyed = destroyed;
        }
    }
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static Queue<Node> que = new LinkedList<>();
    private static int[][] arr;
    private static boolean[][][] visited;
    private static int[] dx = {1,-1,0,0};
    private static int[] dy = {0,0,1,-1};


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M][2];

        for(int i = 0 ; i < N ; i++){
            String line = br.readLine();
            for(int j = 0 ; j < M ; j++){
                arr[i][j] = line.charAt(j);
            }
        }
    }
    public static void bfs(){
        que.add(new Node(0,0,1,false));
        visited[0][0][1]=true;

        while (!que.isEmpty()){
            int sz = que.size();

            for(int s = 0 ; s < sz ; s++){
                Node node = que.poll();

                if(node.x == N-1 && node.y == M-1){
                    System.out.println(node.cnt);
                    return;
                }

                for(int i = 0 ; i < 4 ; i++){
                    int dr = dx[i] + node.x;
                    int dc = dy[i] + node.y;

                    if(dr < 0 || dc < 0 || dr >=N || dc >=M) continue;

                    if(arr[dr][dc]=='0'){ //벽 x
                        if(!node.destroyed && !visited[dr][dc][0]){ //부신벽 x
                            que.add(new Node(dr,dc, node.cnt+1,false ));
                            visited[dr][dc][0] =true;
                        }else if(node.destroyed && !visited[dr][dc][1]){
                            que.add(new Node(dr,dc,node.cnt + 1,true));
                            visited[dr][dc][1] =true;
                        }
                    }else{ //벽
                        if(!node.destroyed){
                            que.add(new Node(dr,dc,node.cnt+1, true));
                            visited[dr][dc][1] = true;
                        }
                    }
                }

            }
        }
        System.out.println(-1);

    }

    public static void process() {
        bfs();
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
