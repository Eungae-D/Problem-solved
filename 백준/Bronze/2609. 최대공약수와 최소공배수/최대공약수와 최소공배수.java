import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int N,M;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st =  new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
    }

    public static void process(){
        //유클리드 호제법(최대공약수)
        int temp = 0;
        int n = N;
        int m = M;

        while(n%m != 0) {
            temp = n%m;
            n = m;
            m = temp;
        }
        //최대공약수
        sb.append(m).append("\n");
        //최소공배수
        sb.append(N*M/m);
        System.out.println(sb);
    }
    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
