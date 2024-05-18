import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int A,B;
    private static boolean[] isPrime = new boolean[100000010];

    //소수 체크
    public static void primeCheck(){
        for(int i = 2 ; i * i <= 100000000 ; i++){
            if(isPrime[i]){
                for(int j = i*i ; j <= 100000000 ; j+=i){
                    isPrime[j] = false;
                }
            }
        }
    }

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        Arrays.fill(isPrime,true);

        isPrime[0] = false;
        isPrime[1] = false;

        primeCheck();

        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

    }
    //펠린드롬 체크(sb.reverse() 대신 구현)
    public static boolean palindromeCheck(int i){
        int input = i;
        int reverseNum = 0;

        while (i != 0){
            int lastNum = i%10;
            reverseNum = reverseNum*10+lastNum;
            i/=10;
        }
        if(input == reverseNum){
            return true;
        }else{
            return false;
        }
    }

    //실행
    public static void process() {
        for(int i = A ; i <= B ; i++){
            if(isPrime[i] && palindromeCheck(i)){
                sb.append(i).append("\n");
            }
        }
        sb.append(-1).append("\n");
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
        System.out.println(sb.toString());
    }
}
