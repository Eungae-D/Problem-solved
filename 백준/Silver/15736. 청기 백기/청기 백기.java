import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int N;
    private static int answer = 1;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
    }

    public static void process(){
        for(int i = 2 ; i*i <= N ; i++){
            answer++;
        }
        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
