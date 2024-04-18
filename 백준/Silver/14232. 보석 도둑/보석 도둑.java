import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static long K;
    private static int count = 0;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        K = Long.parseLong(br.readLine());
    }

    //실행
    public static void process() {
        long tmp = K;

        //소인수분해 구하기
        for(long i = 2 ; i*i <K+1 ; i++){
            while(tmp % i == 0){
                sb.append(i+" ");
                count++;
                tmp /= i;
            }
        }

        if(tmp != 1){
            sb.append(tmp);
            count++;
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
        System.out.println(count);
        System.out.println(sb.toString());
    }
}
