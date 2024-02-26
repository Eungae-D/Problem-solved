import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int N;
    private static int[][] arr;
    private static int[] nutrition;
    private static int answer = Integer.MAX_VALUE;
    private static boolean[]visited;
    private static ArrayList<Integer> list = new ArrayList<>();


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        nutrition = new int[4];
        arr = new int[N][5];
        visited= new boolean[N];


        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < 4 ; i++){
            nutrition[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 5 ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
//        System.out.println(Arrays.deepToString(arr));
    }

    public static void process(){
        recur(0,0,0,0,0,0);
        if(answer == Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(answer);
            for(int i : list){
                System.out.print((i+1)+" ");
            }
        }
    }

    public static void recur(int cur, int mp, int mf, int ms, int mv, int cost){
        if(mp >= nutrition[0] && mf >= nutrition[1] && ms >= nutrition[2] && mv >= nutrition[3]){
            if(cost<answer){
                answer = cost;
                list.clear();
                for(int i = 0 ; i < N; i++){
                    if(visited[i]){
                        list.add(i);
                    }
                }
            }
            return;
        }

        if(cur == N ){
            return;
        }

        visited[cur] = true;
        recur(cur+1,mp+arr[cur][0],mf+arr[cur][1],ms+arr[cur][2],mv+arr[cur][3],cost+arr[cur][4]);

        visited[cur] = false;
        recur(cur+1,mp,mf,ms,mv,cost);

    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
