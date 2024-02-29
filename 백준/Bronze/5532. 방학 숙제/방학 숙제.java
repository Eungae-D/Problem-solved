import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int L,A,B,C,D;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        L = Integer.parseInt(br.readLine());

        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());
        D = Integer.parseInt(br.readLine());
    }

    public static void process() {
        int korean = A/C;
        if(A%C!=0){
            korean++;
        }

        int math = B/D;
        if(B%D!=0){
            math++;
        }
        
        System.out.println(L - Math.max(korean,math));
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
