import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,K;
    private static Queue<Integer> que;
    private static int answer = 0;
    private static boolean[] visited = new boolean[200010];
    private static int[] time = new int[200010];
    private static int[] position = new int[200010];
    private static int[]mul = {1,1,2};
    private static int[]add = {-1,1,0};
    private static int d = 0;
    private static Stack<Integer> stack = new Stack<>();


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
    }

    public static void bfs(){
        que = new LinkedList<>();
        que.add(N);
        visited[N] = true;

        while (!que.isEmpty()){
            int sz = que.size();

            for(int s = 0 ; s < sz ; s++){
                int cur = que.poll();

                if(cur == K){
                    return;
                }

                for(int i = 0 ; i < 3 ; i++){
                    int nxt = mul[i] * cur + add[i];

                    if(nxt<0 || nxt >200000 || visited[nxt]) continue;

                    visited[nxt] = true;
                    que.add(nxt);
                    position[nxt] = cur;
                }
            }
            d++;
        }
    }

    public static void process() {
        bfs();
        int idx = K;
        stack.add(idx);
        while (idx!=N){
            stack.add(position[idx]);
            idx = position[idx];
        }
        System.out.println(d);
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}