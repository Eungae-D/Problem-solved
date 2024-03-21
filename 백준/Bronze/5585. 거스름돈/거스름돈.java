import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static int N;
    private static int answer;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
    }

    public static void process() {
        N = 1000-N;

        answer += N/500;
        N = N%500;

        answer += N/100;
        N = N%100;

        answer += N/50;
        N = N%50;

        answer += N/10;
        N = N%10;

        answer += N/5;
        N = N%5;

        answer += N/1;
        N = N%1;
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
        System.out.println(answer);
    }
}
