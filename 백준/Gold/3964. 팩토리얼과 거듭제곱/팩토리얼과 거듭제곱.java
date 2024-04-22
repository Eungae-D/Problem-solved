import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int T;
    private static long N,K;
    private static boolean[] isPrime = new boolean[1000010];
    private static ArrayList<Long> primes = new ArrayList<Long>();
    public static void eratosthenes(){
        isPrime[0] = isPrime[1] = false;

        for(long i = 2; i <= 1000000 ; i++){
            if(!isPrime[(int)i]) continue;

            primes.add(i);

            for(long j = i*i ; j <= 1000000 && j > 0; j+=i){
                isPrime[(int)j] = false;
            }
        }
    }

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());

        Arrays.fill(isPrime, true);
        eratosthenes();

        for(int tc = 0 ; tc < T ; tc++){
            st = new StringTokenizer(br.readLine());

            N = Long.parseLong(st.nextToken());
            K = Long.parseLong(st.nextToken());

            process();
        }
    }
    public static Map<Long,Integer> primeCount(long k){
        Map<Long,Integer> count = new TreeMap<>();

        for(long prime : primes){
            if(prime * prime > k) break;

            int cnt = 0;
            while(k%prime == 0){
                cnt++;
                k/=prime;
            }
            if(cnt>0){
                count.put(prime,cnt);
            }
        }
        if(k>1){
            count.put(k,1);
        }

        return count;
    }
    public static long countFactorial(long n, long prime){
        long count = 0;
        while(n >= prime){
            count += n/prime;
            n /= prime;
        }
        return count;
    }

    //실행
    public static void process() {
        Map<Long,Integer> primeCheck = primeCount(K);
        long min = Long.MAX_VALUE;

        for(Map.Entry<Long,Integer> entry : primeCheck.entrySet()){
            long prime = entry.getKey();
            int cnt = entry.getValue();

            min = Math.min(min, countFactorial(N,prime)/cnt);
        }
        sb.append(min).append("\n");
    }


    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb);
    }
}
