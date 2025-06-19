import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    private static BufferedReader br;
    private static int t;

    private static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
    }

    private static void process() throws IOException {
        for (int i = 0; i < t; i++) {
            int len = Integer.parseInt(br.readLine());
            String s1 = br.readLine();
            String s2 = br.readLine();

            int diffB = 0;
            int diffW = 0;

            for (int j = 0; j < len; j++) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    if (s1.charAt(j) == 'B') diffB++;
                    else diffW++;
                }
            }

            int result = Math.max(diffB, diffW);
            System.out.println(result);
        }
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
