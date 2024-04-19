import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static long sum = 0;


    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
    }

    //실행
    public static void process() {
        for(int i = 2 ; i < N ; i++){
            sum+=(N/i-1)*i;
        }
        sum %= 1000000;
        System.out.println(sum);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
