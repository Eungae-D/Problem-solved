import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        while (true) {
            String line = br.readLine();

            if(line.equals("END")){
                break;
            }

            StringBuilder reverse = new StringBuilder(line);
            reverse.reverse();
            sb.append(reverse+"\n");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws Exception {
        input();
    }
}
