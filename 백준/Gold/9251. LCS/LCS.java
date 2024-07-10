import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static char[] left, right;
    private static int lineLength, lineTwoLength;
    private static int[][] dp;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        String line = br.readLine();
        lineLength = line.length();
        left = new char[lineLength];

        String lineTwo = br.readLine();
        lineTwoLength = lineTwo.length();
        right = new char[lineTwoLength];

        for(int i = 0 ; i <lineLength; i++){
            left[i] = line.charAt(i);
        }
        for(int i = 0 ; i < lineTwoLength; i++){
            right[i] = lineTwo.charAt(i);
        }

        dp = new int[lineLength+1][lineTwoLength+1];

    }

    //실행
    public static void process() {
        for(int i = 1; i <= lineLength; i++){
            for(int j = 1; j <= lineTwoLength; j++){
                if(left[i-1] == right[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
//        System.out.println(Arrays.deepToString(dp));
        System.out.println(dp[lineLength][lineTwoLength]);

    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}