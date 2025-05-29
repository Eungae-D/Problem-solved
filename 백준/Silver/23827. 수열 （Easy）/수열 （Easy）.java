import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[] A;
    private static long[] prefix;
    private static int MOD = 1000000007;
    
    private static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        A = new int[N];
        prefix = new long[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void process() {
        prefix[0] = A[0];
        for (int i = 1; i < N; ++i) {
            prefix[i] = prefix[i - 1] + A[i];
        }

        long answer = 0;
        
        for (int i = 0; i < N; ++i) {
            long sum = prefix[N - 1] - prefix[i];
            answer = (answer + A[i] * sum % MOD) % MOD;
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws IOException {
        input();
        process();
    }
}
