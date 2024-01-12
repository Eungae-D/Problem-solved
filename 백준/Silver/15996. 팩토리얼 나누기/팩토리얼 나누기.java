import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());


        long n = Long.parseLong(st.nextToken());
        long primeNum = Long.parseLong(st.nextToken());
        int cnt = 0;

        for(long i = primeNum; i<=n; i*=primeNum){
            cnt+= n/i;
        }

        System.out.println(cnt);
    }
}
