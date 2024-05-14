import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static long gcd,lcm;
    private static long temp;
    private static long A,B;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        gcd = Long.parseLong(st.nextToken());
        lcm = Long.parseLong(st.nextToken());

        temp = gcd * lcm;
        A = gcd;
        B = lcm;
    }
    public static long foundGCD(long x, long y){
        while(x%y != 0){
            long temp = x%y;
            x = y;
            y = temp;
        }
        return y;
    }

    //실행
    public static void process() {
        for(long i = gcd ; i*i <= temp ; i+=gcd){
            if(temp%i == 0 && foundGCD(i,temp/i) == gcd){
                long a = i;
                long b = temp/i;
                if(A+B>a+b){
                    A = a;
                    B = b;
                }
            }
        }

        System.out.println(A+" "+B);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
