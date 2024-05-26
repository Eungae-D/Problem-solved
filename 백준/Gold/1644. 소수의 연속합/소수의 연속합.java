import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static boolean[] isPrime = new boolean[4000010];
    private static ArrayList<Integer> list = new ArrayList<Integer>();
    public static void primeCheck(){
        isPrime[0] = false;
        isPrime[1] = false;

        for(long i = 2 ; i <= 4000000 ; i++){
            if(isPrime[(int)i]){
                for(long j = i*i ; j <= 4000000 ; j+=i){
                    isPrime[(int) j] = false;
                }
            }
        }

        for(int i = 2 ; i <=4000000 ; i++){
            if(isPrime[i]) list.add(i);
        }
    }

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        Arrays.fill(isPrime,true);

        primeCheck();
//        System.out.println(list);
    }

    //실행
    public static void process() {
        int s = 0;
        int e = 0;
        int sum = list.get(0);
        int count = 0;
        int size = list.size();

        while(s<=e){
            if(sum==N){
                count++;
                sum-=list.get(s);
                s++;
            }else if(sum < N){
                e++;
                if(e == size) break;
                
                sum+=list.get(e);
            }else if(sum > N){
                sum-=list.get(s);
                s++;
            }
        }
        System.out.println(count);

    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
