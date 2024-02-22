import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[][]arr;
    private static int min = Integer.MAX_VALUE;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        arr = new int[N][2];

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
    }

    public static void process() {
        recur(0,0,1,0);
        System.out.println(min);
    }

    public static void recur(int cur, int cnt,int a,int b){
        if(cur==N){
            if(cnt!=0){
                min = Math.min(min,Math.abs(a-b));
            }
            return;
        }

        recur(cur+1,cnt+1,a*arr[cur][0],b+arr[cur][1]);
        recur(cur+1,cnt,a,b);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
