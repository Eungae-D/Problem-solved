import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static int N;
    private static int[] arr;
    private static int max = Integer.MIN_VALUE;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
    }

    public static void process() {
        for(int i = 0 ; i < N ; i++){
            max = Math.max(max , arr[i]*(N-i));
        }

        System.out.println(max);
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
