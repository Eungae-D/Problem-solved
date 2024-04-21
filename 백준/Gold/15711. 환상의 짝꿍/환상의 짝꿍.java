import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int T;
    private static long A,B;
    private static ArrayList<Integer> list = new ArrayList<Integer>();
    private static boolean[] isPrime = new boolean[2000010];
    public static void eratosthenes(){
        isPrime[0] = true;
        isPrime[1] = true;

        for(long i = 2 ; i < 2000000 ; i++){
            if(isPrime[(int)i]) continue;

            list.add((int)i);

            for(long j = i*i ; j < 2000000 ; j += i){
//                System.out.println(j);
                isPrime[(int)j] = true;
            }
        }

    }

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());

        eratosthenes();
        for(int tc = 0 ; tc<T ; tc++){
            st = new StringTokenizer(br.readLine());

            A = Long.parseLong(st.nextToken());
            B = Long.parseLong(st.nextToken());
            process(A+B);
        }
    }
    public static boolean check(long input){
        if(input <= 2000000){
            return !isPrime[(int)input];
        }

        for(int i = 0 ; i < list.size() ; i++){
            if(input % list.get(i) == 0 ){
                return false;
            }
        }
        return true;
    }

    //실행
    public static void process(long sum) {
        if(sum <4){
            sb.append("NO").append("\n");
        }else if(sum%2==0){
            sb.append("YES").append("\n");
        }else{
            if(check(sum-2)){
                sb.append("YES").append("\n");
            }else{
                sb.append("NO").append("\n");
            }
        }

    }


    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb.toString());
    }
}
