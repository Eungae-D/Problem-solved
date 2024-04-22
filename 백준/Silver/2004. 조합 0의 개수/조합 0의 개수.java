import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static long N,M;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Long.parseLong(st.nextToken());
        M = Long.parseLong(st.nextToken());
    }
    public static long cnt5(long input){
        long temp = 0;
        while(input >= 5){
            temp += input/5;
            input /=5;
        }
        return temp;
    }

    public static long cnt2(long input){
        long temp = 0;
        while(input >= 2){
            temp += input/2;
            input /=2;
        }
        return temp;
    }

    //실행
    public static void process() {
        long countFive = cnt5(N) - cnt5(N-M) - cnt5(M);
        long countTwo = cnt2(N) - cnt2(N-M) - cnt2(M);

        System.out.println(Math.min(countFive,countTwo));
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
