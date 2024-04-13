import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder answer;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static String line;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        answer = new StringBuilder();

        while (true){
            line = br.readLine();
            if(line.equals("0")) break;
            process();
        }
    }

    //실행
    public static void process() {
        
        StringBuilder sb = new StringBuilder();
        sb.append(line);
        sb.reverse();
        
        if(line.equals(sb.toString())){
            answer.append("yes").append("\n");
        }else{
            answer.append("no").append("\n");
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        System.out.println(answer.toString());
    }
}
