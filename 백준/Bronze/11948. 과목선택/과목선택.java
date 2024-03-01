import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int A,B,C,D,E,F;
    private static int answer;



    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());
        D = Integer.parseInt(br.readLine());
        E = Integer.parseInt(br.readLine());
        F = Integer.parseInt(br.readLine());

    }

    public static void process() {
        answer = A + B + C + D + E + F - (Math.min(A,Math.min(B,Math.min(C,D)))) - (Math.min(E,F));
        System.out.println(answer);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
