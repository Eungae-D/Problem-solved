import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static class Node {
        int x;
        int y;
        int cnt;
        boolean destroy;
        public Node(int x, int y, int cnt, boolean destroy){
            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.destroy = destroy;
        }
    }
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static int[][] arr;
    private static boolean[][][] visited;
    private static Queue<Node> que = new LinkedList<>();
    private static int[] dx = {1,-1,0,0};
    private static int[] dy = {0,0,1,-1};

    //입력
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
            for(int j = 0 ; j < M; j++){
                arr[i][j] = line.charAt(j)-'0';
            }
        }
    }
    public static void bfs(){
        que.add(new Node(0,0,1,false));
        visited[0][0][0] = true;
        visited[0][0][1] = true;

        while (!que.isEmpty()){

            for(int s = 0 ; s < que.size() ; s++){
                Node cur = que.poll();

                if(cur.x == N-1 && cur.y == M-1){
                    System.out.println(cur.cnt);
                    return;
                }

                for(int i = 0 ; i < 4 ; i++){
                    int dr = dx[i] + cur.x;
                    int dc = dy[i] + cur.y;

                    if(dr<0 || dr>=N || dc<0 || dc>=M) continue;

                    //벽 x
                    if(arr[dr][dc] == 0){
                        //부신벽이 x
                        if(!cur.destroy && !visited[dr][dc][0]){
                            que.add(new Node(dr,dc,cur.cnt+1,false));
                            visited[dr][dc][0] = true;
                        }else if(cur.destroy && !visited[dr][dc][1]){
                            //부신벽 o
                            que.add(new Node(dr,dc,cur.cnt+1,true));
                            visited[dr][dc][1] = true;
                        }
                    }else{
                        //벽
                        if(!cur.destroy){
                            que.add(new Node(dr,dc,cur.cnt+1,true));
                            visited[dr][dc][1] = true;
                        }
                    }
                }

            }
        }
        System.out.println(-1);
    }

    //실행
    public static void process() {
        bfs();
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}