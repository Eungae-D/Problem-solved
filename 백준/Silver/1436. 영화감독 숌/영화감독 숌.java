import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int N;
    private static int count = 0;
    private static int answer = 665;


    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
    }

    public static void process(){
        while (true){
            answer++;

            String line = String.valueOf(answer);

            if(line.contains("666")){
                count++;
            }

            if(count == N){
                System.out.println(answer);
                break;
            }
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
