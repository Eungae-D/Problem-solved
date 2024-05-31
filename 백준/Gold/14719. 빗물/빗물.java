import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int H,W;
    private static int[] arr, prefix,suffix;
    private static int rain;
    private static int answer;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());

        arr = new int[510];
        prefix = new int[510];
        suffix = new int[510];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= W ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            rain += arr[i];
        }
    }

    //실행
    public static void process() {
        for(int i = 1 ; i < prefix.length ; i++){
            prefix[i] = Math.max(prefix[i-1],arr[i]);
        }

        for(int i = suffix.length-2 ; i >= 1 ; i--){
            suffix[i] = Math.max(suffix[i+1],arr[i]);
        }

        for(int i = 1 ; i < arr.length; i++){
            answer+=Math.min(prefix[i],suffix[i])-arr[i];
        }
        System.out.println(answer);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
