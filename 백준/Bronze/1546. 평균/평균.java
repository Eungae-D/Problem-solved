import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[]arr;
    private static double sum = 0;
    private static double answer = 0;
    private static double max = Integer.MIN_VALUE;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }
    }

    //실행
    public static void process() {
        for(int i = 0; i < N; i++){
            sum += arr[i]/max *100;
        }
        System.out.println(sum/N);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
