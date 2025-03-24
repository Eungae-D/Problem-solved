import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int T,N;
    private static int[] arr = new int[1010];

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        process();

        T = Integer.parseInt(st.nextToken());
        for(int tc = 0 ; tc<T ; tc++){
            N = Integer.parseInt(br.readLine());
            sum(N);
        }
    }
    public static void sum(int n){
        sb.append(arr[n]).append("\n");
    }
    public static int gcd(int a, int b){
        while (a%b != 0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void process(){
        arr[1] = 3;


        for(int i = 2 ; i <= 1000 ; i++){
            int line = 0;
            for(int j = 1 ; j < i ; j++){
                if(gcd(i,j) == 1){
                    line+=2;
                }
            }

            arr[i] = arr[i-1]+line;
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        System.out.println(sb.toString());
    }
}
