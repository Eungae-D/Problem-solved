import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int cheapHamburger = Integer.MAX_VALUE;
    private static int cheapLiquid = Integer.MAX_VALUE;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        for(int i = 0 ; i < 3 ; i ++){
            st = new StringTokenizer(br.readLine());
            cheapHamburger = Math.min(cheapHamburger,Integer.parseInt(st.nextToken()));
        }

        for(int i = 0 ; i < 2 ; i ++){
            st = new StringTokenizer(br.readLine());
            cheapLiquid = Math.min(cheapLiquid,Integer.parseInt(st.nextToken()));
        }
    }

    public static void process() {
        System.out.println(cheapHamburger+cheapLiquid-50);
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
