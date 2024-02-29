import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int A,B;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < 4 ; i++){
            A+=Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < 4 ; i++){
            B+=Integer.parseInt(st.nextToken());
        }
    }

    public static void process() {
        System.out.println(Math.max(A,B));
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
