import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static StringBuilder sb = new StringBuilder();
    private static int scenario = 0;

    public static void inputAndProcess() throws IOException {
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            String[] names = new String[n + 1];
            int[] count = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                names[i] = br.readLine();
            }

            for (int i = 0; i < 2 * n - 1; i++) {
                st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken());
                count[num]++;
            }

            for (int i = 1; i <= n; i++) {
                if (count[i] == 1) {
                    sb.append(++scenario).append(" ").append(names[i]).append("\n");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        inputAndProcess();
        System.out.print(sb);
    }
}
