import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    private static String A, B;
    private static int result;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = st.nextToken();
        B = st.nextToken();
    }

    public static void process() {
        result = 50;

        for (int i = 0; i <= B.length() - A.length(); i++) {
            int count = 0;
            for (int j = 0; j < A.length(); j++) {
                if (A.charAt(j) != B.charAt(i + j)) {
                    count++;
                }
            }
            result = Math.min(result, count);
        }

        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        input();
        process();
    }
}
