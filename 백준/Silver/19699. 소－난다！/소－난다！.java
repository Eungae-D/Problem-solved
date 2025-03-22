import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;

    static int n, m;
    static int[] weight;
    static boolean[] visited;
    static HashSet<Integer> set = new HashSet<>();

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        weight = new int[n];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            weight[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void process() {
        recur(0, 0, 0);
        ArrayList<Integer> result = new ArrayList<>(set);
        Collections.sort(result);

        if (result.isEmpty()) {
            System.out.println(-1);
        } else {
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }

    static void recur(int cur, int sum, int start) {
        if (cur == m) {
            if (isPrime(sum)) {
                set.add(sum);
            }
            return;
        }

        for (int i = start; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                recur(cur + 1, sum + weight[i], i + 1);
                visited[i] = false;
            }
        }
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
