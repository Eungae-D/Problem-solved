import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[] arr, prefix, suffix;
    private static int answer = 0;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        arr = new int[1010];
        prefix = new int[1010];
        suffix = new int[1010];

        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            arr[x] = Integer.parseInt(st.nextToken());
        }
    }

    //실행
    public static void process() {
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = Math.max(prefix[i-1],arr[i]);
        }

        for(int i = suffix.length - 2; i >=0 ; i--){
            suffix[i] = Math.max(suffix[i+1], arr[i]);
        }

        for(int i = 1 ; i<arr.length; i++){
            answer += Math.min(prefix[i], suffix[i]);
        }

        System.out.println(answer);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
