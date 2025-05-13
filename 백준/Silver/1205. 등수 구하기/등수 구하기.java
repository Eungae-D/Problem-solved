import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    private static int n, point, p;
    private static ArrayList<Integer> rankList = new ArrayList<>();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        point = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());

        if (n > 0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                rankList.add(Integer.parseInt(st.nextToken()));
            }
        }
    }

    public static void process() {
        if (n == 0) {
            System.out.println(1);
            return;
        }

        if (rankList.size() == p && point <= rankList.get(rankList.size() - 1)) {
            System.out.println(-1);
            return;
        }

        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (point >= rankList.get(i)) {
                rank = i + 1;
                break;
            } else {
                rank++;
            }
        }

        if (rank <= p) {
            System.out.println(rank);
        } else {
            System.out.println(-1);
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        process();
    }
}
