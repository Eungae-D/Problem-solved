import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static String line;
    private static int[] arr = new int[26];


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        line = st.nextToken();
    }

    public static void process() {
        for(int i = 0 ; i < line.length(); i++){
            arr[line.charAt(i)-'a']++;
        }
        for(int count : arr){
            sb.append(count).append(" ");
        }
        System.out.println(sb.toString());
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
