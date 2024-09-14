import java.io.*;
import java.util.*;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
//    private static StringTokenizer st;
    private static long N;
    private static int count = 0;


    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
//        st = new StringTokenizer(br.readLine());

        N = Long.parseLong(br.readLine());
    }

    //실행
    public static void process() {

        for(long i = 2 ; i*i <= N; i++){
            while(N%i==0){
                sb.append(i+" ");
                count++;
                N/=i;
            }
        }
        if(N!=1){
            sb.append(N);
            count++;
        }

        System.out.println(count);
        System.out.println(sb.toString());
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}