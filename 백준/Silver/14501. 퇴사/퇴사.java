import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[][] arr;
    private static int answer = Integer.MIN_VALUE;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        arr = new int[N][2];
        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

//        System.out.println(Arrays.deepToString(arr));
    }

    public static void process() {
        recur(0,0);
        System.out.println(answer);
    }

    public static void recur(int cur, int price){
        if(cur >= N){
            answer = Math.max(answer,price);
            return;
        }

        //선택 o
        if(cur+arr[cur][0]<=N){
            recur(cur+arr[cur][0],price+arr[cur][1]);
        }
        //선택 x
        recur(cur+1,price);

    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
