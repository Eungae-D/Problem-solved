import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int x;
    private static int c = 1;
    private static int sum = 0;

    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(br.readLine());
    }

    public static void process() {
        while (true) {
            if(x <= c+sum){
                if(c % 2 == 1){
                    System.out.println((c-(x-sum-1))+"/"+(x-sum));
                    break;
                }else{
                    System.out.println((x-sum)+"/"+(c-(x-sum-1)));
                    break;
                }
            }else{
                sum+=c;
                c++;
            }
        }
    }
    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
