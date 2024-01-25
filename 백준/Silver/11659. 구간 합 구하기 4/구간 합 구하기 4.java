import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int n, m, i, j;
    private static int[] arr;


    public static void input() throws Exception{
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n+1];
        st= new StringTokenizer(br.readLine());

        for(int i = 1 ; i <= n; i++){
            arr[i] =  arr[i-1]+Integer.parseInt(st.nextToken());
        }
    }

    public static void process() throws Exception{
        for(int i = 0 ; i < m ; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            sb.append(arr[end]-arr[start-1]+"\n");
        }
        System.out.println(sb);

    }


    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
