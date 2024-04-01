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
    private static int L,W;
    private static int[][]arr;
    private static boolean[][]visited;
    private static int[] dx = {1,-1,0,0};
    private static int[] dy = {0,0,1,-1};
    private static Queue<Node> que = new LinkedList<>();
    private static int answer = Integer.MIN_VALUE;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());

        arr = new int[L][W];

        for(int i = 0 ; i < L ; i++){
            String line = br.readLine();
            for(int j = 0 ; j < W ; j++){
                char word = line.charAt(j);
                if(word == 'W'){
                    arr[i][j] = 0;
                }else{
                    arr[i][j] = 1;
                }
            }
        }
    }
    public static int bfs(int x, int y){
        que.add(new Node(x,y));
        visited[x][y] = true;
        int d = 0;

        while(!que.isEmpty()){
            int sz = que.size();

            for(int s = 0 ; s < sz; s++){
                Node node = que.poll();
                int curX = node.x;
                int curY = node.y;

                for(int i = 0 ; i < 4 ; i++){
                    int dr = curX + dx[i];
                    int dc = curY + dy[i];

                    if( dr >= 0 && dc >= 0 && dr<L && dc<W){
                        if(visited[dr][dc] || arr[dr][dc] == 0) continue;

                        que.add(new Node(dr,dc));
                        visited[dr][dc] = true;
                    }
                }
            }
            d++;
        }

        return d;
    }

    public static void process() {
        for(int i = 0 ; i < L ; i++){
            for(int j = 0 ; j < W ; j++){
                if(arr[i][j] == 0) continue;

                visited = new boolean[L][W];
                int max = bfs(i,j);
                answer = Math.max(answer,max);
            }
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
        System.out.println(answer-1);
    }
}
