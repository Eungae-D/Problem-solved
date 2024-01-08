import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
    static String blank = " ";
    static String lineBreak = "\n";

    static int a,b,c,d,e,f;

    static void sb(){
        sb = new StringBuilder();
    }

    static void stk() throws Exception{
        st = new StringTokenizer(br.readLine());
    }

    static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        sb();
        stk();

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());
    }

    static void process(){
        for(int i = -999; i <=999; i++){
            for(int j = -999; j<= 999; j++){
                if(a*i+b*j==c&&d*i+e*j==f){
                    sb.append(i).append(blank).append(j);
                    System.out.println(sb.toString());
                    return;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
       input();
       process();
    }

}
