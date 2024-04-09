import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static List<List<Integer>> v;
    private static int[][]arr;
    private static boolean[] visited;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        v = new ArrayList<>();
        for(int i = 0 ; i <= N ; i++){
            v.add(new ArrayList<>());
        }

        for(int i = 0 ; i < N-1; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            v.get(s).add(e);
            v.get(e).add(s);
        }

        arr = new int[N+1][2];
        visited = new boolean[N+1];

    }
    public static void dfs(int cur){
        visited[cur] = true;
        arr[cur][0] = 1;

        for(int nxt : v.get(cur)){
            if(visited[nxt]) continue;

            dfs(nxt);
            arr[cur][1] += arr[nxt][0];
            arr[cur][0] += Math.min(arr[nxt][0], arr[nxt][1]);
        }
    }

    public static void process() {
        dfs(1);
        System.out.println(Math.min(arr[1][0],arr[1][1]));
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
