import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static long N;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Long.parseLong(st.nextToken());
    }
    public static boolean isPrime(long input){
        if(input == 1){
            return false;
        }

        for(long i = 2 ; i * i <= N ; i++){
            if(input % i == 0){
                return false;
            }
        }

        return true;

    }
    public static boolean checkNum(long input){
        String line = String.valueOf(input);

        if(line.contains("3") || line.contains("4") || line.contains("7")) return false;

        return true;
    }

    public static long reverseNum(long input){
        long result = 0;
        while (input > 0){
            if(input % 10 == 6){
                result = result * 10 + 9;
            }else if(input % 10 == 9){
                result = result * 10 + 6;
            }else{
                result = result * 10 + input % 10;
            }

            input /= 10;
        }

        return result;
    }

    public static void process(){
        if(!isPrime(N)){
            System.out.println("no");
        }else{
            //숫자인지 아닌지
            if(!checkNum(N)){
                System.out.println("no");
            }else{
                //뒤집고 소수
                long reverseNum = reverseNum(N);

                if(!isPrime(reverseNum)) System.out.println("no");
                else System.out.println("yes");
            }
        }

    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
