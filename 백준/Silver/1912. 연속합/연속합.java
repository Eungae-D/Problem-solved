import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[] arr,prefix;
    private static int max = Integer.MIN_VALUE;


    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        arr = new int[N+1];
        prefix = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    //실행
    public static void process() {
        for(int i = 1 ; i <= N ; i++){
            prefix[i] = Math.max(prefix[i-1]+arr[i],arr[i]);

            max = Math.max(max,prefix[i]);
        }
        System.out.println(max);

    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
