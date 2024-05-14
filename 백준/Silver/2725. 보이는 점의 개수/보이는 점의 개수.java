import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int T,N;
    private static int[] arr = new int[1010];

    //최대공약수
    public static int gcd(int i, int j){
        while(i%j != 0){
            int temp = i%j;
            i = j;
            j = temp;
        }
        return j;
    }

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());

        arr[1] = 3;
        for(int i = 2 ; i <= 1000 ; i++){
            int cnt = 0;
            for(int j = 1 ; j < i ; j++){
                if(gcd(i,j) == 1){
                    cnt+=2;
                }
            }
            arr[i] = arr[i-1]+cnt;
        }

        for(int tc = 0 ; tc < T ; tc++){
            N = Integer.parseInt(br.readLine());

            process();
        }
    }

    //실행
    public static void process() {
        sb.append(arr[N]).append("\n");
    }


    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb);
    }
}
