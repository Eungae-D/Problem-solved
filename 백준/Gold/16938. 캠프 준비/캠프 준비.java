import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,L,R,X;
    private static int[] variables;
    private static int count = 0;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        variables = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            variables[i] = Integer.parseInt(st.nextToken());
        }

    }
    public static void recur(int cur, int sum,int cnt, int min, int max){
        if(cur == N){
            if(cnt>=2 && sum>=L && sum<=R && max-min >= X){
                count++;
            }
            return;
        }

        recur(cur+1,sum+variables[cur],cnt+1,Math.min(min,variables[cur]),Math.max(max,variables[cur]));
        recur(cur+1,sum,cnt,min,max);
    }

    //실행
    public static void process() {
        recur(0,0,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        System.out.println(count);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}