import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static int[][]arr;
    private static boolean[][]visited;
    private static Queue<int[]> que;
    private static int answer = 0;
    private static int cheeze = 0;
    private static int time  = 0 ;
    private static int[] dx = {1,-1,0,0};
    private static int[] dy = {0,0,1,-1};


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < M ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1){
                    cheeze++;
                }
            }
        }
    }
    public static void dfs(){
        que = new LinkedList<>();
        que.add(new int[]{0,0});
        visited[0][0] = true;

        while (!que.isEmpty()){
            int sz = que.size();

            for(int s = 0 ; s<sz ; s++){
                int[] cur = que.poll();

                for(int i = 0 ; i < 4 ; i++){
                    int dr = cur[0] + dx[i];
                    int dc = cur[1] + dy[i];

                    if(dr>=0 && dc>=0 && dr<N && dc<M){
                        if(visited[dr][dc]) continue;

                        visited[dr][dc] = true;
                        if(arr[dr][dc] == 1){
                            cheeze--;
                            arr[dr][dc] = 0;
                        }else{
                            que.add(new int[] {dr,dc});
                        }

                    }
                }
            }
        }
    }

    public static void process() {
        while(cheeze!=0){
            answer = cheeze;
            time++;
            visited = new boolean[N][M];
            dfs();
        }
        System.out.println(time);
        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
