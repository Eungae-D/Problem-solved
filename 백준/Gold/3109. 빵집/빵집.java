import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int R,C;
    private static char[][] arr;
    private static boolean[][] visited;
    private static int answer = 0;
    private static int[] dx = {-1, 0, 1};
    private static int[] dy = {1, 1, 1};

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr = new char[R][C];
        visited = new boolean[R][C];

        for(int i = 0; i < R; i++) {
            String line = br.readLine();
            for(int j = 0; j < C; j++) {
                arr[i][j] = line.charAt(j);
            }
        }
    }

    public static boolean dfs(int x, int y) {
        visited[x][y] = true;

        if(y == C-1) {
            answer++;
            return true;
        }

        for(int i = 0; i < 3; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < R && ny >= 0 && ny < C && !visited[nx][ny] && arr[nx][ny] == '.') {
                if(dfs(nx, ny)) return true;
            }
        }

        return false; 
    }

    public static void process() {
        for(int i = 0; i < R; i++) {
            if(arr[i][0] == '.' && !visited[i][0]) {
                dfs(i, 0);
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}