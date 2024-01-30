import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;

    private static int tc, d,n;
    private static long ans;
    private static long[] arr;




    private static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        tc = Integer.parseInt(st.nextToken());

        for(int t = 0 ; t < tc; t++){
            st = new StringTokenizer(br.readLine());
            d = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());

            arr = new long[d+1];

            long sum = 0;

            st = new StringTokenizer(br.readLine());

            for(int i = 0 ; i < n; i ++){
                sum += Integer.parseInt(st.nextToken());
                arr[(int)(sum%d)]++;
            }
            process();
        }

    }

    private static void process() {
        ans = arr[0];
        for(int i = 0 ; i < d; i++){
            long cnt = arr[i];
            if(cnt==0) continue;
            ans+=cnt*(cnt-1)/2;
        }
        sb.append(ans).append("\n");
    }

    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb);
    }
}
