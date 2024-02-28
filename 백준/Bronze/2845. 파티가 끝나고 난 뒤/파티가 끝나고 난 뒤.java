import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int L,P;
    private static int[]arr = new int[5];

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void process() {
        int area = L*P;

        for(int i = 0 ; i < arr.length ; i++){
            sb.append(arr[i]-area).append(" ");
        }
        
        System.out.println(sb);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
