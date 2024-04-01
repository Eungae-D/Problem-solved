import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static class Node{
        int x;
        int time;
        public Node(int x, int time) {
            this.x = x;
            this.time = time;
        }
    }
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,K;
    private static boolean[] visited = new boolean[200010];
    private static Queue<Node> que;
    private static int answer = Integer.MAX_VALUE;



    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

    }
    public static void bfs(){
        que = new LinkedList<>();
        que.add(new Node(N,0));
        visited[N] = true;

        while (!que.isEmpty()){
            int sz = que.size();

            for(int s = 0 ; s<sz ; s++){
                Node node = que.poll();

                if(node.x == K){
                    answer = Math.min(answer,node.time);
                    break;
                }

                int[] next = {node.x *2, node.x-1, node.x+1};

                for(int i = 0 ; i < 3; i++){
                    int nxt = next[i];

                    if(nxt<0 || nxt>200000 || visited[nxt]) continue;

                    visited[nxt] = true;
                    if(i==0){
                        que.add(new Node(nxt,node.time));
                    }else{
                        que.add(new Node(nxt, node.time+1));
                    }
                }
            }
        }
    }

    public static void process() {
        bfs();
        System.out.println(answer);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
