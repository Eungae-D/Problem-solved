import java.io.*;
import java.util.*;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int A,B,N,W;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());

    }

    //실행
    public static void process() {
        int count = 0;
        for(int i = 1 ; i <= 1000; i++){
            for(int j = 1 ; j <= 1000; j++){
                if(i+j == N && A*i + B*j == W){
                    sb.append(i+" "+j);
                    count++;
                }
            }
        }

        if(count!=1){
            System.out.println(-1);
        }else{
            System.out.println(sb.toString());
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}