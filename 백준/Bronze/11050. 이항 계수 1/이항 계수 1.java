import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,K;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
    }

    //실행
    public static void process() {
        int a = 1;
        int b = 1;

        for(int i = N; i > N-K ; i--){
            a *= i;
        }

        for(int i = 1 ; i <=K ; i++){
            b *= i;
        }

        System.out.println(a/b);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
