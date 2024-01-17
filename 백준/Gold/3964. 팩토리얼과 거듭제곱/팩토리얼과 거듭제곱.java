import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static boolean[] notPrime;
    static ArrayList<Long> primes;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();

        notPrime = new boolean[1000001];
        primes = new ArrayList<>();

        notPrime[0] = true;
        notPrime[1] = true;

        for(int i = 2; i < notPrime.length; i++){
            if(notPrime[i]) continue;

            primes.add((long)i);

            for(int j = i*i; j< notPrime.length && j>0; j+=i){
                notPrime[j]=true;
            }
        }

        for(int tc = 0 ; tc<t; tc++){
            long n = sc.nextLong();
            long k = sc.nextLong();


            Map<Long,Integer> primeCheck = primeCount(k);
            long result = Long.MAX_VALUE;

            for(Map.Entry<Long,Integer> entry : primeCheck.entrySet()){
                long prime = entry.getKey();
                int count = entry.getValue();
                result = Math.min(result,countFactorial(n,prime)/count);
            }
            System.out.println(result);




        }
    }
    public static Map<Long, Integer> primeCount(long k) {
        Map<Long, Integer> count = new HashMap<>();
        for(long prime : primes){
            if(prime * prime > k) break;
            int cnt = 0;
            while(k%prime ==0){
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

    public static long countFactorial(long n, long prime) {
        long count = 0;
        while (n > 0) {
            count += n / prime;
            n /= prime;
        }
        return count;
    }
}
