import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static Map<Long,Integer> map ;
    private static int n;
    private static long[]a,b;
    private static long ans;


    private static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        map = new TreeMap<>();
        map.put(0L, 1);

        a = new long[n+1];
        b = new long[n+1];

        st = new StringTokenizer(br.readLine());

        for(int i = 1; i <= n ; i++){
            a[i] = a[i-1]+Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n ; i++){
            b[i] = b[i-1]+Integer.parseInt(st.nextToken());
        }
    }

    private static void process() {
        for(int i = 1; i <= n ; i++){
            long dif = a[i]-b[i];

            ans+=map.getOrDefault(dif,0);
            map.put(dif, map.getOrDefault(dif,0)+1);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
