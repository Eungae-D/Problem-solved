import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static List<List<Integer>> v;
    private static int[] arr;



    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        v = new ArrayList<>();
        for(int i = 0 ; i <=N; i++){
            v.add(new ArrayList<>());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= N ; i++){
            int s = Integer.parseInt(st.nextToken());

            if(s == -1) continue;

            v.get(s).add(i);
        }

        arr = new int[N+1];
        for(int i = 0 ; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            arr[p] += w;
        }
    }
    public static void dfs(int cur){
        for(int nxt : v.get(cur)){
            arr[nxt] += arr[cur];
            dfs(nxt);
        }
    }

    public static void process() {
        dfs(1);
        for(int i = 1 ; i <= N ; i++){
            sb.append(arr[i]+" ");
        }
        System.out.println(sb);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }

}
