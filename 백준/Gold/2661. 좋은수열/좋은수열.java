import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int n;
    private static int s = 1, e = 3;

    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
    }
    public static boolean isGood(String s){
        int len = s.length();
        for(int i = 1; i <= len/2 ; i++){
            String back = s.substring(len - i);
            String front = s.substring(len - 2*i,len-i);

            if(back.equals(front)) return false;
        }

        return true;
    }

    public static void recur(String line){

        if(line.length() == n){
            System.out.println(line);
            System.exit(0);
        }

        for(int i = 1 ; i <= 3 ; i++){
            String next = line+i;
            if(isGood(next)){
                recur(next);
            }
        }
    }

    public static void process(){
        recur("");
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
