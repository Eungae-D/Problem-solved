
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int n;
    private static int k;
    private static long count;
    private static long[] arr,sum;
    private static Map<Long,Integer> map;


    private static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new long[n+1];
        sum = new long[n+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <=n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i] = sum[i-1]+arr[i];
        }

    }

    private static void process(){
        map = new TreeMap<>();
        map.put(0L,1);


        for(int i = 1; i <=n ;i++){
            count+=map.getOrDefault(sum[i]-k,0);
            map.put(sum[i],map.getOrDefault(sum[i],0)+1);
        }

        System.out.println(count);

    }
    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
