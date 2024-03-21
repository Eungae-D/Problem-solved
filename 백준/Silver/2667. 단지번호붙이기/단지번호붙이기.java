import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[][] arr;
    private static boolean[][] visited;
    private static int[] dx = {-1,1,0,0};
    private static int[] dy = {0,0,1,-1};
    private static int cnt = 0;
    private static ArrayList<Integer> answer = new ArrayList<>();

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        visited = new boolean[N][N];

        for(int i = 0; i < N; i++){
            String line = br.readLine();
            for(int j = 0; j < N; j++){
                arr[i][j] = line.charAt(j)-'0';
                if(arr[i][j] == 0){
                    visited[i][j] = true;
                }
            }
        }
//        System.out.println(Arrays.deepToString(visited));
    }
    public static void dfs(int x, int y){
        visited[x][y] = true;

        for(int i = 0 ; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx>=0 && ny>=0 && nx<N && ny<N){
                if(!visited[nx][ny] && arr[nx][ny] == 1){
                    cnt++;
                    dfs(nx,ny);
                }
            }
        }
    }

    public static void process() {
        for(int i = 0; i < N; i++){
            for(int j = 0 ; j < N ; j++){
                if(arr[i][j] == 0) continue;

                if(visited[i][j]) continue;

                cnt = 1;
                dfs(i,j);
                answer.add(cnt);
            }
        }
        Collections.sort(answer);
        System.out.println(answer.size());
        for(int count : answer){
            System.out.println(count);
        }

    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
