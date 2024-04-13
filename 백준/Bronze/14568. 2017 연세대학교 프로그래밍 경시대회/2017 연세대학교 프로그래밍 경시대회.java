import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader br;
    private static int N;
    private static int answer = 0;

    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));

        N= Integer.parseInt(br.readLine());
    }
    public static void process() {
        for(int i = 1 ; i < N; i++){
            for(int j = 1 ; j < N ; j++){
                for(int k = 1 ; k < N ; k++){
                    if(N-(i+j+k) !=0 ) continue;

                    if(i%2==1) continue;

                    if(j < k+2) continue;

                    answer++;
                }
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
