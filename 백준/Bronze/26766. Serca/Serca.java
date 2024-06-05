import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
    }

    //실행
    public static void process() {
        for(int i = 0 ; i < N ; i++){
            sb.append(" @@@   @@@ ").append("\n");
            sb.append("@   @ @   @").append("\n");
            sb.append("@    @    @").append("\n");
            sb.append("@         @").append("\n");
            sb.append(" @       @ ").append("\n");
            sb.append("  @     @  ").append("\n");
            sb.append("   @   @   ").append("\n");
            sb.append("    @ @    ").append("\n");
            sb.append("     @     ").append("\n");
        }
        System.out.println(sb);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
