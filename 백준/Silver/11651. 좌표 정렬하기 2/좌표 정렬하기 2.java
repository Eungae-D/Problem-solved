import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static class Node implements Comparable<Node>{
        int x;
        int y;
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Node o){
            if(this.y == o.y){
                return this.x - o.x;
            }

            return this.y-o.y;
        }
    }
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static PriorityQueue<Node> queue = new PriorityQueue<>();


    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            queue.add(new Node(x,y));
        }
    }

    //실행
    public static void process() {
        while (!queue.isEmpty()){
            Node n = queue.poll();
            sb.append(n.x+" "+n.y).append("\n");
        }
        System.out.println(sb);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
