import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int A,B,C;
    private static int max = Integer.MIN_VALUE;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
    }

    public static void process() {

        if(A == B && A == C && B == C){
            System.out.println(10000+A*1000);
        }else if(A == B){
            System.out.println(1000+(A*100));
        }else if(A == C){
            System.out.println(1000+(A*100));
        }else if(B == C) {
            System.out.println(1000+(C*100));
        }else{
            max = Math.max(max,Math.max(B,Math.max(A,C)));
            System.out.println(max*100);
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
