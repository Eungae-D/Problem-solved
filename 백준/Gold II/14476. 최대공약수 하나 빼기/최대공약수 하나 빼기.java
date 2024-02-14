import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int n;
    private static int[] arr, left, right;

    private static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void input() throws Exception {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        arr = new int[n + 1];
        left = new int[n + 1];
        right = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void process() {
        left[1] = arr[1];
        right[n] = arr[n];

        for (int i = 2; i <= n; i++) {
            left[i] = gcd(left[i - 1], arr[i]);
        }

        for (int i = n - 1; i >= 1; i--) {
            right[i] = gcd(right[i + 1], arr[i]);
        }

        int answer = 0;
        int value = 0;

        for (int i = 1; i < n; i++) {
            int current = gcd(left[i - 1], right[i + 1]);
            if (arr[i] % current != 0 && value < current) {
                answer = arr[i];
                value = current;
            }
        }

        if (answer == 0 && value == 0) {
            System.out.println(-1);
        } else {
            System.out.println(value + " " + answer);
        }
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
