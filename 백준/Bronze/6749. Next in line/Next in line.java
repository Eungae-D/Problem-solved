import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int Y,M;
    private static int answer;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        Y = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

    }

    public static void process() {
        answer = Math.max(Y,M)+(Math.max(Y,M)-Math.min(Y,M));
        System.out.println(answer);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
