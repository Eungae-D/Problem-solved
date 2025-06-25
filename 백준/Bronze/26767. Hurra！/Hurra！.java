import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int n;

    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        
        n = Integer.parseInt(st.nextToken());
    }

    public static void process(){
        for(int i = 1 ; i <= n ; i++){
            if(i%7 == 0 && i%11 == 0){
                System.out.println("Wiwat!");;
            }else if(i%7 == 0){
                System.out.println("Hurra!");
            }else if(i%11 == 0){
                System.out.println("Super!");
            }else{
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
