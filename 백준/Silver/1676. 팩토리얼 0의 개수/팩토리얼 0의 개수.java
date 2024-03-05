import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
    }

    public static void process() {
        int cnt = 0;
        while(N>=5){
            cnt +=N/5;
            N=N/5;
        }
        System.out.println(cnt);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
