import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int n;
    private static Queue<Integer> q = new PriorityQueue<>();

    public static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (q.size() == n) {
                    if (q.peek() < num) {
                        q.poll();
                        q.add(num);
                    }
                } else {
                    q.add(num);
                }
            }
        }
    }

    public static void process() {
        System.out.println(q.poll());
    }

    public static void main(String[] args) throws IOException {
        input();
        process();
    }
}
