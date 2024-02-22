import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static String line;
    private static int sum;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        line = st.nextToken();
    }

    public static void process() {
        for(int i = 0 ; i < N; i++){
            sum+=line.charAt(i)-'0';
        }
        System.out.println(sum);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
