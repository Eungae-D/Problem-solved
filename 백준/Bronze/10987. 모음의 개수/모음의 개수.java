import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static String line;
    private static int count;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        line = br.readLine();
    }

    public static void process() {
        for(int i = 0 ; i < line.length(); i++){
            char word = line.charAt(i);
            switch (word){
                case 'a' : count++;
                    break;
                case 'e' : count++;
                    break;
                case 'i' : count++;
                    break;
                case 'o' : count++;
                    break;
                case 'u' : count++;
                    break;

            }
        }
        System.out.println(count);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
