import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static int a,b,c,d,e,f;

    static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

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
                    System.out.println(i+" "+j);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
       input();
       process();
    }

}
