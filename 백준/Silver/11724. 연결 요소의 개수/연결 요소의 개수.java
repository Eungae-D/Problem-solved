import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static int[] parents;
    private static int answer;

    public static int find(int x){
        if(parents[x] == x){
            return x;
        }else{
            parents[x] = find(parents[x]);
            return parents[x];
        }
    }

    public static void union(int s, int e){
        s = find(s);
        e = find(e);

        if(s==e) return;

        parents[e] = s;
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

        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            union(s,e);
        }

        TreeSet<Integer> uniqueParents = new TreeSet<>();
        for(int i = 1 ; i < N+1 ; i++){
            uniqueParents.add(find(i));
        }

        System.out.println(uniqueParents.size());
    }
}