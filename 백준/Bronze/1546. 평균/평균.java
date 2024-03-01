import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PrimitiveIterator;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static double[] arr;
    private static double maxScore = Integer.MIN_VALUE;
    private static double answer;



    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        arr = new double[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            maxScore = Math.max(maxScore,arr[i]);
        }
    }

    public static void process() {
        for(int i = 0 ; i < N ; i++){
            answer += (arr[i]/maxScore)*100;
        }
        System.out.println(answer/N);

    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
