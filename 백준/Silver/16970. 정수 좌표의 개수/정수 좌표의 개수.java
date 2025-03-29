import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int N,M,K,answer;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
    }
    public static int gcd(int a, int b){
        if(a == 0 || b == 0){
            return a+b;
        }

        int temp = 0;
        while (a % b != 0){
            temp = a%b;
            a = b;
            b = temp;
        }

        return b;
    }

    public static void process() {
        for(int x1 = 0 ; x1 <= N ; x1++){
            for(int y1 = 0 ; y1 <= M ; y1++){
                for(int x2 = 0 ; x2 <= N ; x2++){
                    for(int y2 = 0 ; y2 <= M ; y2++){
                        if(gcd(x2-x1, y2-y1)+1 == K){
                            answer++;
                        }
                    }
                }
            }
        }

        System.out.println(answer);
    }


    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
