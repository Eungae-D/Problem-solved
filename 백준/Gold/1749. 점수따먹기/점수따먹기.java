import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int n,m, ans;
    private static int[][] arr;
    private static int[][] prefix;


    private static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        arr = new int[200][200];
        prefix = new int[200][200];

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for(int i = 1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1 ; j<=m ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1; i <=n; i++){
            for(int j = 1; j <=m ; j++){
                prefix[i][j] += arr[i][j]+prefix[i][j-1]+prefix[i-1][j]-prefix[i-1][j-1];
//                System.out.print(prefix[i][j]+" ");
            }
//            System.out.println();
        }
    }

    private static void process() {

        ans = Integer.MIN_VALUE;
        
        for(int x1 = 1 ; x1<=n; x1++){
            for(int y1 = 1 ; y1<=m; y1++){
                for(int x2 = x1; x2<=n; x2++){
                    for(int y2 = y1; y2<=m; y2++){
                        ans = Math.max(ans,prefix[x2][y2]-prefix[x1-1][y2]-prefix[x2][y1-1]+prefix[x1-1][y1-1]);
                    }
                }
            }
        }
        System.out.println(ans);
    }




    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
