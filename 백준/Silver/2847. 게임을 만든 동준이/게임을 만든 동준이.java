import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[]arr;
    private static int answer = 0;



    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for(int i = 0 ; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    public static void process() {
        if( N == 1){
            System.out.println(0);
        }else{
            for(int i = N-1; i > 0; i--){
                while (arr[i]<=arr[i-1]){
                    answer++;
                    arr[i-1] = arr[i-1] -1;
                }
            }
            System.out.println(answer);
        }

    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
