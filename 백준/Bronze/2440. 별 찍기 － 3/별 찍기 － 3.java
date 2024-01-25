import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int n;

    private static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
    }

    private static void process() {

        while (n>0){
            for(int i = 0 ; i <n; i++){
                System.out.print("*");
            }
            System.out.println();
            n--;
        }


    }
    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
