import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int N;
    private static int[] parents;
    private static int[] size = new int[1000010];

    public static int find(int x){
        if(parents[x] == x){
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

        if(size[a] > size[b]){
            parents[b] = a;
            size[a] += size[b];
        }else{
            parents[a] = b;
            size[b] += size[a];
        }
    }

    public static void main(String[] args) throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        parents = new int[1000010];
        for(int i = 0 ; i < 1000010 ; i++){
            parents[i] = i;
        }

        Arrays.fill(size,1);

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            String IorQ = st.nextToken();

            if(IorQ.equals("I")){
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                union(a,b);
            }else{
                int x = Integer.parseInt(st.nextToken());
                sb.append(size[find(x)]).append("\n");
            }
        }
        System.out.println(sb.toString());

    }
}