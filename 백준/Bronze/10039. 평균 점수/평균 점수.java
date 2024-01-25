import java.io.*;
import java.util.*;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int sum;


    public static void input(){
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void process() throws Exception{

        for(int i = 0 ; i < 5 ; i++){
            st = new StringTokenizer(br.readLine());
            int record = Integer.parseInt(st.nextToken());
            if(record<40){
                sum+=40;
            }else{
                sum+=record;
            }
        }

        System.out.println(sum/5);
    }


    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
