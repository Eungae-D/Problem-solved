import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,E;
    private static int[] parents;
    private static int[] size;

    public static int find(int x){
        if(parents[x]==x){
            return x;
        }else {
            parents[x] = find(parents[x]);
            return parents[x];
        }
    }

    public static void union(int s, int e){
        s = find(s);
        e = find(e);

        if(s == e) return;

        parents[e] = s;
        size[s] += size[e];
    }

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        E = Integer.parseInt(br.readLine());

        parents = new int[110];
        for(int i = 0 ; i < 110 ; i++){
            parents[i] = i;
        }
        size = new int[110];
        Arrays.fill(size, 1);

        for(int i = 0 ; i < E ; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            union(s,e);
        }
        System.out.println(size[find(1)]-1);
    }
}