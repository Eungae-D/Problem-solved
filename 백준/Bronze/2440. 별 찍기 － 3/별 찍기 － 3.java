import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int n;

    private static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        n = Integer.parseInt(st.nextToken());
    }

    private static void process() {
        for(int i = 0 ; i < n ; i++){
            for(int j = n-i; j>0; j--){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
