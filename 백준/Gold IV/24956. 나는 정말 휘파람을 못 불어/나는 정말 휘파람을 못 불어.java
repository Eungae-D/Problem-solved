
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static char[] s;
    private static long w,wh,whe,whee;
    private static long mod = 1000000007;
    private static long result;
    private static int n;

    private static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        s = new char[n];

        st = new StringTokenizer(br.readLine());


    }

    private static void process() {
        String s = st.nextToken();
        for(int i = 0 ; i < n; i++){
            if(s.charAt(i)=='W'){
                w++;
            }else if(s.charAt(i)=='H'){
                wh+=w;
            }else if(s.charAt(i)=='E'){
                whee = 2*whee;
                whee += whe;
                whee%=mod;
                whe += wh;
            }
        }
        System.out.println(whee);
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
