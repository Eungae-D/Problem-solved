import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[][]arr;
    private static int[]time = new int[1010];
    private static int totalCount = 0;
    private static int min = Integer.MAX_VALUE;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        arr = new int[N][2];
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
    }

    //실행
    public static void process() {
        for(int i = 0 ; i < N ; i++){
            for(int j = arr[i][0] ; j < arr[i][1] ; j++){
                if(time[j] == 0){
                    totalCount++;
                }
                time[j] ++;
            }
        }

        for(int i = 0 ; i < N ; i++){
            int count = 0;
            for(int j = arr[i][0] ; j < arr[i][1] ; j++){
                if(time[j] == 1){
                    count++;
                }
            }
            min = Math.min(min,count);
        }

        System.out.println(totalCount-min);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
