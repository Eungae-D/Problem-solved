import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M,K;
    private static int count;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

    }

    public static void process() {
        for(int i = 0 ; i < N; i++){
            for(int j = 0 ; j < M ; j++){
                if(count==K){
                    System.out.println(i+" "+j);
                }
                count++;
            }
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
