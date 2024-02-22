import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int R1,average;
    private static int R2;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        R1 = Integer.parseInt(st.nextToken());
        average = Integer.parseInt(st.nextToken());
    }

    public static void process() {
        R2 = average*2-R1;
        System.out.println(R2);
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
