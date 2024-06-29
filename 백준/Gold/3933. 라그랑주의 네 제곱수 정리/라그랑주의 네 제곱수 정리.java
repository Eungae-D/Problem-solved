import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;

    // 입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        ArrayList<Integer> inputs = new ArrayList<>();

        while (true) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) break;
            inputs.add(input);
        }

        for (int n : inputs) {
            sb.append(process(n)).append("\n");
        }

        System.out.print(sb.toString());
    }

    public static int process(int input) {
        int count = 0;

        for (int i = 0; i * i <= input; i++) {
            for (int j = i; j * j <= input - i * i; j++) {
                for (int k = j; k * k <= input - i * i - j * j; k++) {
                    int remaining = input - i * i - j * j - k * k;
                    int l = (int) Math.sqrt(remaining);
                    if (l >= k && l * l == remaining) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) throws Exception {
        input();
    }
}