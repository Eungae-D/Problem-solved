import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int answer = Integer.MAX_VALUE;
    static int[][] arr;
    static int N;
    static boolean[][] visited;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    public static void process() {
        recur(0, 0);
        System.out.println(answer);
    }

    static void recur(int cur, int sum) {
        if (sum >= answer) return;

        if (cur == 3) {
            answer = Math.min(sum, answer);
        } else {
            for (int i = 1; i < N - 1; i++) {
                for (int j = 1; j < N - 1; j++) {
                    if (!visited[i][j] && visit(i, j)) {
                        int cost = sumCost(i, j);
                        recur(cur + 1, sum + cost);
                        clearVisit(i, j);
                    }
                }
            }
        }
    }

    static boolean visit(int x, int y) {
        for (int i = 0; i < 4; i++) {
            if (visited[x + dx[i]][y + dy[i]]) {
                return false;
            }
        }
        return true;
    }

    static int sumCost(int x, int y) {
        int sum = arr[x][y];
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            sum += arr[x + dx[i]][y + dy[i]];
            visited[x + dx[i]][y + dy[i]] = true;
        }
        return sum;
    }

    static void clearVisit(int x, int y) {
        for (int i = 0; i < 4; i++) {
            visited[x + dx[i]][y + dy[i]] = false;
        }
        visited[x][y] = false;
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
