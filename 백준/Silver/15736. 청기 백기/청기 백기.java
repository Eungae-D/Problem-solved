import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static long N;
    private static int ans = 1;

    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
    }

    public static void process() {
        for(int i = 2 ; i * i <= N ; i++){
            ans++;
        }

        System.out.println(ans);
    }


    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
