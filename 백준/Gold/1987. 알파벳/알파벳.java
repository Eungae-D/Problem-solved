import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int R,C;
    private static int[][]arr;
    private static boolean[][] visited;
    private static boolean[] alphabet;
    private static int[] dx = {1,-1,0,0};
    private static int[] dy = {0,0,1,-1};
    private static int answer = 0;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr = new int[R][C];
        visited = new boolean[R][C];
        alphabet = new boolean[26];

        for(int i = 0 ; i < R ; i++){
            String line = br.readLine();
            for(int j = 0 ; j < C ; j++){
                arr[i][j] = line.charAt(j) - 'A';
            }
        }
    }
    public static void dfs(int x, int y,int count){
        visited[x][y] = true;
        alphabet[arr[x][y]] = true;

        answer = Math.max(answer,count);

        for(int i = 0 ; i < 4 ; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx>=0 && ny >=0 && nx < R && ny <C){
                if(visited[nx][ny] || alphabet[arr[nx][ny]]) continue;

                dfs(nx,ny, count+1);
            }
        }
        visited[x][y] = false;
        alphabet[arr[x][y]] = false;
    }

    public static void process() {
        dfs(0,0,1);
        System.out.println(answer);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
