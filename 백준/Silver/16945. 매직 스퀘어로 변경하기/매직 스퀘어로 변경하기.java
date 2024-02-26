import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int[][] arr = new int[3][3];
    private static int[][] arr2 = new int[3][3];
    private static boolean[] visited = new boolean[10];
    private static int answer = Integer.MAX_VALUE;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        for(int i = 0 ; i < 3 ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3;  j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

    }

    public static void process() {
        recur(0,0,0);
        System.out.println(answer);
    }

    public static boolean check(){
        int total;

        for(int i = 0 ; i < 3 ; i++){
            total = 0;
            for(int j = 0 ; j < 3; j++){
                total += arr2[i][j];
            }
            if(total != 15) return false;
        }

        for(int j = 0 ; j < 3; j++){
            total = 0;
            for(int i = 0 ; i <3 ; i++){
                total += arr2[i][j];
            }
            if(total != 15) return false;
        }

        if(arr2[0][0] + arr2[1][1] + arr2[2][2] != 15) return false;
        if(arr2[0][2] + arr2[1][1] + arr2[2][0] != 15) return false;
        return true;
    }

    public static void recur(int x, int y, int price){
        if(y==3){
            x++;
            y = 0;
        }

        if(x == 3){
            if(!check()) return;

            answer = Math.min(answer,price);

            return;
        }

        for(int i = 1; i < 10; i++){
            if(visited[i]) continue;

            visited[i] = true;
            arr2[x][y] = i;
            recur(x,y+1, price+Math.abs(arr[x][y]-i));
            visited[i] = false;
        }
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
