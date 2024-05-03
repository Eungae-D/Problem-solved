import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int a,b,c;
    private static int max = 0;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        while(true){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            if( a==0 && b==0 && c == 0) break;

            process();
        }
    }

    //실행
    public static void process() {
        if ((a * a) + (b * b) == (c * c)) System.out.println("right");
        else if ((b * b) + (c * c) == (a * a)) System.out.println("right");
        else if ((c * c) + (a * a) == (b * b)) System.out.println("right");
        else System.out.println("wrong");
    }


    public static void main(String[] args) throws Exception {
        input();
    }
}
