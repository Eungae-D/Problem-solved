import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int N, answer, sum;
    private static int s,e;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());

    }

    public static void process(){
        s = 1;
        e = 1;
        sum = 1;

        while(s<=e){
            if(sum == N) answer++;
            if(sum < N){
                e++;
                sum+=e;
            } else if (sum >= N) {
                sum -= s;
                s++;
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
