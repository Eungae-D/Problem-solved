import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    private static BufferedReader br;
    private static StringTokenizer st;
    private static int hour,minute = 0;

    public static void main(String[] args) throws IOException {
        
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        hour = Integer.parseInt(st.nextToken());
        minute = Integer.parseInt(st.nextToken());

        if (hour == 9) {
            System.out.println(minute);
        } else {
            System.out.println((hour - 9) * 60 + minute);
        }
    }
}
