import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static class Location{
        int x;
        int y;
        Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static int[][] arr;
    private static int min = Integer.MAX_VALUE;
    private static ArrayList<Location> chicken = new ArrayList<>();
    private static ArrayList<Location> house = new ArrayList<>();
    private static boolean[] visited;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][N];
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < N ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j]==1){
                    house.add(new Location(i,j));
                }else if(arr[i][j]==2){
                    chicken.add(new Location(i,j));
                }
            }
        }
        visited = new boolean[chicken.size()];
    }
    public static void recur(int cur, int start){
        if(cur==M){
            int ans = 0;
            for(int i = 0 ; i < house.size(); i++){
                int temp = Integer.MAX_VALUE;
                for(int j = 0 ; j < chicken.size(); j++){
                    if(visited[j]){
                        int dis = Math.abs(house.get(i).x-chicken.get(j).x)+Math.abs(house.get(i).y-chicken.get(j).y);
                        temp = Math.min(temp,dis);
                    }
                }
                ans+=temp;
            }
            min = Math.min(min,ans);
            return;
        }

        for(int i = start; i < chicken.size(); i++){
            visited[i] = true;
            recur(cur+1,i+1);
            visited[i] = false;
        }
    }

    //실행
    public static void process() {
        recur(0,0);
        System.out.println(min);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}