import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static String n;
    private static boolean[] number = new boolean[10];
    private static long answer;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        n = br.readLine();
        N = Integer.parseInt(n);
        M = Integer.parseInt(br.readLine());


        if(M > 0){
            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < M ; i++){
                number[Integer.parseInt(st.nextToken())] = true;
            }
        }
    }
    public static void recur(int cur, int touch){
        if( cur > 0 ){
            int cnt = Math.abs(N-touch) + cur;
            answer = Math.min(answer, cnt);
        }

        if(cur == n.length()+1){
            return;
        }

        if(cur==6){
            return;
        }

        for(int i = 0 ; i < 10 ; i++){
            if(!number[i]){
                recur(cur+1, touch*10+i);
            }
        }
    }

    //실행
    public static void process() {
        answer = Math.abs(N-100);
        recur(0,0);
        System.out.println(answer);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}