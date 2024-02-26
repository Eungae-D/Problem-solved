import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int N,K;
    private static int[][]arr;
    private static boolean[] visited;
    private static int answer = Integer.MIN_VALUE;

    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());


        arr = new int[N][N];
        visited = new boolean[N];
        for(int i = 0; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < N ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    public static void process() {
        recur(0,0);
        System.out.println(answer);
    }

    private static int cal(){
        int sum = 0;
        for(int i = 0; i < N; i++){
            for(int j = i+1 ; j < N; j++){
                if(visited[i] && visited[j]){
                    sum+=arr[i][j];

                }
            }
        }
//        System.out.println(sum);
        return sum;
    }

    public static void recur(int cur, int count){
        if(count == K){
            answer = Math.max(answer,cal());
            return;
        }

        if(cur==N){
            return;
        }

        //현재 재료 선택
        visited[cur] = true;
        recur(cur+1,count+1);

        //현재 재료 선택 x
        visited[cur] = false;
        recur(cur+1,count);
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
