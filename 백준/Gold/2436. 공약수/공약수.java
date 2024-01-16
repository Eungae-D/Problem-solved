import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long gcd = Integer.parseInt(st.nextToken());
        long lcm = Integer.parseInt(st.nextToken());

        long product = lcm / gcd;

        long answerA = gcd;
        long answerB = lcm;

        for (int i = 1; i * i <= product; i++) {
            if (product % i == 0 && foundGCD(i, product / i) == 1) {
                long a = gcd * i;
                long b = gcd * (product / i);
                if (a + b < answerA + answerB) {
                    answerA = a;
                    answerB = b;
                }
            }
        }
        System.out.println(answerA + " " + answerB);
    }

    public static long foundGCD(long a, long b) {
        return b == 0 ? a : foundGCD(b, a % b);
    }
}
