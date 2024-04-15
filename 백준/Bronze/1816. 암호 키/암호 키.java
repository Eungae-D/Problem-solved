import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static boolean isPrime = false;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N ; i++){
            long input = Long.parseLong(br.readLine());
            isPrime = check(input);
            process();
        }
    }

    public static boolean check(Long input) {
        for(int i = 2 ; i < 1000001 ; i++){
            if(input % i == 0 ){
                return false;
            }
        }
        return true;
    }

    public static void process(){
        if(isPrime){
            sb.append("YES").append("\n");
        }else{
            sb.append("NO").append("\n");
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb.toString());
    }
}
