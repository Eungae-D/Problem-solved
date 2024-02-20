import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,L,R,X;
    private static int[]problems;
    private static int answer=0;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N =Integer.parseInt(st.nextToken());
        L =Integer.parseInt(st.nextToken());
        R =Integer.parseInt(st.nextToken());
        X =Integer.parseInt(st.nextToken());

        problems = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N; i++){
            problems[i] = Integer.parseInt(st.nextToken());
        }


    }

    public static void process() {
        recur(0,0,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }

    public static void recur(int cur,int cal,int cnt, int min, int max){
        if (cur == N) {
            if (cnt >= 2 && cal >= L && cal <= R && max - min >= X) {
                answer++;
            }
            return;
        }

        // 현재 문제를 포함하는 경우
        recur(cur + 1, cal + problems[cur], cnt + 1, Math.min(min, problems[cur]), Math.max(max, problems[cur]));

        // 현재 문제를 포함하지 않는 경우
        recur(cur + 1, cal, cnt, min, max);
    }



    public static void main(String[] args) throws Exception {
        input();
        process();
        System.out.println(answer);
    }
}
