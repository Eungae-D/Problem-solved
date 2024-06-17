import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,S;
    private static int[] arr;
    private static int answer;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }
    public static void recur(int cur, int sum, int cnt){
        if(cur == N){
            if(sum == S && cnt!=0){
                answer++;
            }
            return;
        }

        recur(cur+1, sum+arr[cur],cnt+1);
        recur(cur+1,sum,cnt);
    }

    //실행
    public static void process() {
        recur(0,0,0);
        System.out.println(answer);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}