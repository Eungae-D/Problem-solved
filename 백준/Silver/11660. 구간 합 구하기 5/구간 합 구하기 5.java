import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;

    private static int n,m;
    private static int x1,y1,x2,y2;
    private static int[][]arr,sum;

    private static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n+1][n+1];
        sum = new int[n+1][n+1];

        for(int i = 1 ; i <=n ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <=n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static void process() throws Exception{

        for(int i = 1 ; i <=n; i++){
            for(int j = 1 ; j<=n; j++){
                sum[i][j] = sum[i][j-1]+sum[i-1][j]-sum[i-1][j-1]+arr[i][j];
            }
        }

        for (int i = 0 ; i < m ; i++){
            st = new StringTokenizer(br.readLine());

            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());


            sb.append(sum[x2][y2]-sum[x2][y1-1]-sum[x1-1][y2]+sum[x1-1][y1-1]+"\n");


        }
        System.out.println(sb);
        
    }
    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
