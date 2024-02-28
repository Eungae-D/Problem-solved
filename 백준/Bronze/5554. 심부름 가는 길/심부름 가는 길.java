import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int seconds = 0;
    private static int min;
    private static int second;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        for(int i = 0 ; i < 4 ; i++){
            seconds += Integer.parseInt(br.readLine());
        }
    }

    public static void process() {
        min = seconds/60;
        second = seconds%60;

        System.out.println(min);
        System.out.println(second);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
