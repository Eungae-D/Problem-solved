import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static int N;
    private static int nLength;

    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        nLength = String.valueOf(N).length();
    }
    public static void process(){
        for(int i = N-nLength*9; i < N ; i++){
            int value = i;
            int sum = i;

            while ( value%10 != 0){
                sum += value%10;
                value = value/10;
            }

            if(sum == N){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
