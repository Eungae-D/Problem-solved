import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PushbackReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static ArrayList<Integer>[] adj;
    private static int N,M,K;
    private static int[] money;
    private static boolean[] visited;
    private static long answer = 0;
    private static int minMoney;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //학생수
        M = Integer.parseInt(st.nextToken()); //관계수
        K = Integer.parseInt(st.nextToken()); //시드머니

        adj = new ArrayList[N+1];
        visited = new boolean[N+1];
        money = new int[N+1];

        for(int i = 1 ; i < N+1; i++){
            adj[i] = new ArrayList<>();
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i < N+1; i++){
            money[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            int startV = Integer.parseInt(st.nextToken());
            int endV = Integer.parseInt(st.nextToken());

            adj[startV].add(endV);
            adj[endV].add(startV);
        }
    }
    public static void dfs(int cur){
        visited[cur] = true;

        minMoney = Math.min(minMoney,money[cur]);

        for(int nxt : adj[cur]){
            if(visited[nxt]) continue;

            dfs(nxt);
        }
    }

    public static void process() {
        for(int i = 1; i < N+1; i++){
            if(visited[i]) continue;
            minMoney = Integer.MAX_VALUE;
            dfs(i);
            answer+=minMoney;
        }
        if(answer>K){
            System.out.println("Oh no");
        }else{
            System.out.println(answer);
        }
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}