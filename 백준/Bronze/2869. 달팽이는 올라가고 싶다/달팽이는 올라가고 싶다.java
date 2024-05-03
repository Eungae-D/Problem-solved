import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int A,B,V;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
    }

    //실행
    public static void process() {
        int day = (V-B)/(A-B);
        
        if((V-B)%(A-B)!=0) day++;
        
        System.out.println(day);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
