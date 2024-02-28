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
            if(line.equals("#")) break;
            process(line);
        }
    }

    public static void process(String input) {
        int count = 0;

        for(int i = 0 ; i < input.length(); i++){
            char word = input.charAt(i);
            if(word == 'a' || word == 'e' || word == 'i' || word =='o' || word == 'u'){
                count++;
            }else if(word == 'A' || word == 'E' || word == 'I' || word == 'O' || word == 'U'){
                count++;
            }
        }
        sb.append(count).append("\n");
    }


    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb.toString());
    }
}
