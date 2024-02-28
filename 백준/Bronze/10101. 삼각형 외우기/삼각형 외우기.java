import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int A,B,C;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());
    }

    public static void process() {
        if( A == 60 && B == 60 && C == 60){
            System.out.println("Equilateral");
        }else if ( A + B + C == 180 && ( A == B || B == C || A == C )) {
            System.out.println("Isosceles");
        }else if ( A + B + C == 180 && ( A != B && B != C && A != C )) {
            System.out.println("Scalene");
        }else if( A + B + C != 180 ){
            System.out.println("Error");
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
