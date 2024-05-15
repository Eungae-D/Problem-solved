import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] mult = {0, 1, 3, 4};

    static long calc(long num, long pow) {
        if (num == 0) {
            return 0;
        }

        return ((num / 4) * (long)Math.pow(4, pow) 
        		+ (long)Math.pow(4, pow - 1) * mult[(int)(num % 4)]) 
                + calc(num / 4, pow + 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long start = Long.parseLong(st.nextToken());
        long end = Long.parseLong(st.nextToken());

        long answer = calc(end, 1) - calc(start - 1, 1);

        System.out.println(answer);
        br.close();
    }
}