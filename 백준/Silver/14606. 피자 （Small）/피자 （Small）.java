import java.io.*;
import java.util.*;
public class Main {
    private static BufferedReader br;
    private static int N;
    private static int[] dp;
    
    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
    }
    
    public static void process(){
        dp = new int[11];
        
        dp[2] = 1;
        for (int i = 3; i <= N; i++) {
            dp[i] = i-1 + dp[i-1];
        }
        System.out.print(dp[N]);
        
    }
    
    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}