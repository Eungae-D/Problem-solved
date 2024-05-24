import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int G;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        G = Integer.parseInt(br.readLine());
    }

    //실행
    public static void process() {
        long s = 1;
        long e = 2;

        boolean flag = false;

        while(e<50001){
            long difS = s*s;
            long difE = e*e;

            if(difE-difS == G){
                sb.append(e).append("\n");
                flag = true;
                s++;
                e++;
            }else if(difE-difS<G){
                e++;
            }else{
                s++;
            }
        }

        if(flag){
            System.out.println(sb);
        }else{
            System.out.println(-1);
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
