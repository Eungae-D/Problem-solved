import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int N;
    private static int[][]arr = new int[110][110];
    private static int answer;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            process(x,y,x+10,y+10);
        }

        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j]!=0){
                    answer++;
                }
            }
        }
    }

    public static void process(int x, int y, int i, int j){
        for(int x1 = x ; x1 < i ; x1++){
            for(int y1 = y ; y1 < j ; y1++){
                arr[x1][y1]++;
            }
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        System.out.println(answer);
    }
}
