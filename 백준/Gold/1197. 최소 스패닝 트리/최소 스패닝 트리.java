import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int V,E;
    private static int[] parents;
    private static int[][] graph;
    private static int answer = 0;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        graph = new int[E][3];

        for(int i = 0 ; i < E ; i++){
            st = new StringTokenizer(br.readLine());
            graph[i][0] = Integer.parseInt(st.nextToken());
            graph[i][1] = Integer.parseInt(st.nextToken());
            graph[i][2] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(graph, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2]-o2[2];
            }
        });

        parents = new int[V+1];
        for(int i = 0 ; i < V+1 ; i++){
            parents[i] = i;
        }
    }
    public static int find(int x){
        if(parents[x] == x) {
            return x;
        }else{
            parents[x] = find(parents[x]);
            return parents[x];
        }
    }
    public static void union(int a, int b){
        a = find(a);
        b = find(b);

        if(a==b) return;
        parents[b] = a;
    }

    //실행
    public static void process() {
        for(int i = 0 ; i < E ; i++){
            int a = graph[i][0];
            int b = graph[i][1];
            int c = graph[i][2];

            if(find(a) == find(b)) continue;

            union(a, b);
            answer+=c;
        }
        System.out.println(answer);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}