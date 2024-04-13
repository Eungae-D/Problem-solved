import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static int N;
    private static int answer = 0;
    
    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
    }
    
    //실행
    public static void process() {
        for(int i = 1  ; i <= 500; i++){
            for(int j = 1 ; j <= 500 ; j++){
                if(Math.pow(i,2)-N == Math.pow(j,2)) answer++;
            }
        }

        System.out.println(answer);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
