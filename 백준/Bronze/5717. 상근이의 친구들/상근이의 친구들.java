import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int M,F;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        while(true){
            st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken());
            F = Integer.parseInt(st.nextToken());

            if(M == 0 && F == 0){
                break;
            }

            process();
        }

    }

    public static void process() {
        sb.append(M+F).append("\n");
    }


    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb);
    }
}
