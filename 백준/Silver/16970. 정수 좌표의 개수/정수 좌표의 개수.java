import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M,K;
    private static int answer = 0;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

    }
    public static int gcd(int x, int y){
        if(x == 0 || y == 0){
            return x + y;
        }

        while(x % y != 0){
            int temp = x % y;
            x = y;
            y = temp;
        }
        return y;
    }

    //실행
    public static void process() {
        for(int x1 = 0 ; x1 <= N ; x1++){
            for(int y1 = 0 ; y1 <= M ; y1++){
                for(int x2 = 0 ; x2 <= N ; x2++){
                    for(int y2 = 0 ; y2 <= M ; y2++){
                        if(gcd(Math.abs(x2-x1), Math.abs(y2-y1)) + 1 == K){
                            answer++;
                        }
                    }
                }
            }
        }
        System.out.println(answer/2);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
