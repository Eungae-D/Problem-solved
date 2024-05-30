import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static long W,WH,WHE,WHEE;
    private static long mod = 1000000007;
    private static String line;



    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        line = br.readLine();
    }

    //실행
    public static void process() {
        for(int i = 0 ; i < N ; i++){
            if(line.charAt(i) == 'W'){
                W++;
            }else if(line.charAt(i) == 'H'){
                WH += W;
            }else if(line.charAt(i) == 'E'){
                WHEE *= 2;
                WHEE += WHE;
                WHEE %= mod;
                WHE += WH;
            }
        }
        System.out.println(WHEE);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
