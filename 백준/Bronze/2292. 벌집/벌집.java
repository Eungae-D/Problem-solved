import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static long N;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Long.parseLong(br.readLine());
    }

    //실행
    public static void process() {
        long depth = 1;
        long x = 1;


        if(N==1){
            System.out.println(1);
            return;
        }

        while (true){
            if(N<=x){
                System.out.println(depth);
                break;
            }
            
            x =x+(6*depth);
            depth++;
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
