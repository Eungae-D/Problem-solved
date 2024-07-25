import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static int[] parents;
    private static int[] rank;
    public static int find(int x){
        if(parents[x]==x){
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

        if(rank[a]>rank[b]){
            parents[b] = a;
        }else if(rank[b]<rank[a]){
            parents[a] = b;
        }else{
            parents[b] = a;
            rank[a] += 1;
        }
    }

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        parents = new int[N+1];
        for(int i = 0 ; i < N+1 ; i++){
            parents[i] = i;
        }
        rank = new int[N+1];

        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            int check = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(check == 1){
                int checkA = find(a);
                int checkB = find(b);

                if(checkA == checkB){
                    sb.append("YES").append("\n");
                }else{
                    sb.append("NO").append("\n");
                }
            }else{
                union(a,b);
            }
        }
        System.out.println(sb.toString());
    }
}