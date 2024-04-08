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
    private static int[] colors;
    private static List<List<Integer>> v;
    private static int count = 0;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        v = new ArrayList<>();
        for(int i = 0 ; i <= N ; i++){
            v.add(new ArrayList<>());
        }
        colors = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N ; i++){
            colors[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0 ; i < N-1 ; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            v.get(s).add(e);
            v.get(e).add(s);
        }
    }
    public static void dfs(int cur, int prv){
        for(int nxt : v.get(cur)){
            if(nxt == prv) continue;

            if(colors[nxt] != colors[cur]) count++;

            dfs(nxt,cur);
        }
    }

    public static void process() {
        count = colors[1] == 0 ? 0 : 1;
        dfs(1,0);
        System.out.println(count);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }

}
