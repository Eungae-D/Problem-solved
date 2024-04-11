import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int A,B,N,W;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());

    }

    public static void process() {
        int count = 0;

        for(int i = 1; i <= 1000 ; i++) {
            for(int j = 1 ; j <= 1000 ; j++){

                if(i+j == N && i*A + j*B == W){
                    count++;
                    sb.append(i+" "+j);
                }
            }
        }

        if(count != 1){
            System.out.println(-1);
        }else{
            System.out.println(sb);
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
