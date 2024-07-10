import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static long max = Long.MIN_VALUE;
    private static long sum = 0;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N ; i++){
            long input = Long.parseLong(br.readLine());
            sum += input;
            max = Math.max(max,input);
        }
    }

    public static void process() {
        sum = sum - max;

        if(sum<=max){
            System.out.println(max-sum);
        }else{
            System.out.println((sum+max)%2);
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}