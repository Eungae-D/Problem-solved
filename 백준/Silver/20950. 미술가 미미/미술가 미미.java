import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N ;
    private static int[][] color;
    private static int[] gom;
    private static int answer = Integer.MAX_VALUE;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        color = new int[N][3];
        gom = new int[3];

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 3; j++){
                color[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < 3; i++){
            gom[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void process() {
        recur(0,0,0,0,0);
        System.out.println(answer);
    }

    public static void recur(int cur, int r, int g, int b, int count){
        if(count >= 2 && count <= 7){
            answer = Math.min(answer,Math.abs(gom[0] - r/count) + Math.abs(gom[1] - g/count) + Math.abs(gom[2] - b/count));
        }

        if(count == 7 || cur == N) return;

        recur(cur+1, r+color[cur][0], g+color[cur][1], b+color[cur][2],count+1);
        recur(cur+1,r,g,b,count);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
