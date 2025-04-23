import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    private static int X;
    private static StringBuilder sb = new StringBuilder();

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        X = Integer.parseInt(br.readLine());
    }

    public static void process() {
        int[] sticks = {64, 32, 16, 8, 4, 2, 1};
        int count = 0;
        int sum = 0;

        for (int i = 0; i < 7; i++) {
            if (sticks[i] <= X) {
                sum += sticks[i];
                count++;
            }
            if (sum > X) {
                sum -= sticks[i];
                count--;
            }
            if (sum == X) break;
        }

        sb.append(count);
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        input();
        process();
    }
}
