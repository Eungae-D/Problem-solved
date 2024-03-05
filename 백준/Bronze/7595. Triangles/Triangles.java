import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static int N;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();


        while(true){
            N = Integer.parseInt(br.readLine());
            if(N == 0) return;

            process(N);
        }
    }

    public static void process(int N) {
        for(int i = 0 ; i < N ; i++){
            for(int j = N-i-1 ; j <N; j++){
                sb.append('*');
            }
            sb.append("\n");
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb);
    }
}
