import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int L;
    private static long sum;
    private static long res = 1;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        L = Integer.parseInt(br.readLine());

        String line = br.readLine();
        for(int i = 0 ; i < L ; i++){
            int alphabet = line.charAt(i)-'a'+1;
            process(alphabet);
        }

    }

    //실행
    public static void process(int input) {
        sum += input*res % 1234567891;
        res = (res*31) % 1234567891;
    }


    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sum%1234567891);
    }
}
