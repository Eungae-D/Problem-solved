import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int month;
    private static int day;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        month = Integer.parseInt(br.readLine());
        day = Integer.parseInt(br.readLine());

    }

    public static void process() {
        if(month<2){
            System.out.println("Before");
        }else if(month == 2 && day <18){
            System.out.println("Before");
        }else if(month == 2 && day  == 18){
            System.out.println("Special");
        }else{
            System.out.println("After");
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
