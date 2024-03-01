import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        while (true){
            String line = br.readLine();
            if(line.equals("0")) break;
            process(line);
        }
    }

    public static void process(String line) {
        StringBuilder compare = new StringBuilder();
        compare.append(line);
        compare.reverse();
        if(line.equals(compare.toString())){
            sb.append("yes").append("\n");
        }else{
            sb.append("no").append("\n");
        }

    }


    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb);
    }
}
