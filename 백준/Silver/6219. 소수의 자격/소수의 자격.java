import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int A,B;
    private static String D;
    private static boolean[]isPrime;
    private static int count = 0;

    public static void primeCheck(){
        Arrays.fill(isPrime,true);

        isPrime[0] = false;
        isPrime[1] = false;

        for(long i = 2; i < B+1 ; i++){
            if(!isPrime[(int)i]) continue;

            for(long j = i*i ; j < B+1  ; j+=i){

                isPrime[(int)j] = false;
            }
        }

//        for(int i = 2; i < B+1 ; i++){
//            if(!isPrime[i]) continue;
//
//            for(int j = i*i ; j < B+1  ; j+=i){
//
//                isPrime[j] = false;
//            }
//        }
    }

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        A = Integer.valueOf(st.nextToken());
        B = Integer.valueOf(st.nextToken());
        D = st.nextToken();

        isPrime = new boolean[B+1];

        primeCheck();
    }

    //실행
    public static void process() {
        for(int i = A ; i <= B; i++){
            if(isPrime[i] && String.valueOf(i).contains(D)){
                count++;
            }
        }


        System.out.println(count);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}