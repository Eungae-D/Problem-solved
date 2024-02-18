

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int N,S;
    private static int[] variables;


    private static int count;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        variables = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            variables[i] = Integer.parseInt(st.nextToken());
        }
    }
    public static void process(){
        recur(0,0);
        if(S==0){
            count-=1;
        }
        System.out.println(count);
    }

    public static void recur(int cur, int sum){
        if(cur == N){
            if(sum==S){
                count++;
            }
            return;
        }
        recur(cur+1,sum+variables[cur]);
        recur(cur+1,sum);
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
