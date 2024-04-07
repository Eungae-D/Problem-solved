import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int T;
    private static int N;
    private static int[] parent;
    private static boolean[] visited;
    private static int node1,node2;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        
        for(int tc = 0 ; tc < T ; tc++){
            int N = Integer.parseInt(br.readLine());
            parent = new int[N+1];
            visited = new boolean[N+1];

            for(int i = 0 ; i < N-1; i++){
                st = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());

                parent[e] = s;
            }
            st = new StringTokenizer(br.readLine());
            node1 = Integer.parseInt(st.nextToken());
            node2 = Integer.parseInt(st.nextToken());


            process();

        }
    }
    public static void solve(int n1,int n2){
        while (n1>0){
            visited[n1] = true;
            n1 = parent[n1];
        }

        while (n2>0){
            if(visited[n2]){
                System.out.println(n2);
                break;
            }
            n2 = parent[n2];
        }
    }

    public static void process() {
        solve(node1,node2);
    }


    public static void main(String[] args) throws Exception {
        input();
    }
}
