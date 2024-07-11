import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static ArrayList<Integer>[] adj;
    private static boolean[] visited;
    private static int N;
    private static ArrayList<Integer> result = new ArrayList<>();



    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        adj = new ArrayList[N+1];

        for(int i = 1 ; i < N+1; i++){
            adj[i] = new ArrayList<>();

            int endV = Integer.parseInt(br.readLine());

            adj[i].add(endV);
        }
    }
    public static boolean dfs(int cur,int target){

        if(visited[cur]){
            return cur==target;
        }

        visited[cur] = true;

        for(int nxt : adj[cur]){

            return dfs(nxt,target);

        }
        return false;
    }

    //        return dfs(adj[cur].get(0),target);

    public static void process() {
        for(int i = 1 ; i <N+1; i++){
            visited = new boolean[N+1];
            if(dfs(i,i)){
                result.add(i);
            }

        }
        System.out.println(result.size());
        for(int num : result){
            System.out.println(num);
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}