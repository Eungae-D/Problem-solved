import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static int[][]arr ;
    private static ArrayList<Integer>[] list;
    private static int[] dist;
    private static Queue<Integer> que;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N= Integer.parseInt(st.nextToken());
        M= Integer.parseInt(st.nextToken());
        dist = new int[N+1];

        list = new ArrayList[N+1];
        for(int i = 1 ; i <= N ; i++){
            list[i] = new ArrayList<>();
        }

        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            list[x].add(y);
            list[y].add(x);
        }
    }
    public static int bfs(int start){
        Arrays.fill(dist, -1);

        int cnt = 0;
        que = new LinkedList<>();
        que.add(start);
        dist[start] = 0;

        while(!que.isEmpty()){
            int i = que.poll();

            for(int idx : list[i]){
                if(dist[idx] != -1) continue;

                dist[idx] = dist[i]+1;
                cnt+=dist[idx];
                que.add(idx);
            }
        }

        return cnt;
    }

    public static void process() {
        int count = Integer.MAX_VALUE;
        int minIdx = 0;

        for(int i = 1 ; i <= N; i++){
            int cnt = bfs(i);
            if(count > cnt){
                count = cnt;
                minIdx = i;
            }
        }
        System.out.println(minIdx);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
