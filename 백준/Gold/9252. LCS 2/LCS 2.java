import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static char[] left, right;
    private static int lineLength, lineTwoLength;
    private static int[][] dp;


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

        dp = new int[lineTwoLength+1][lineLength+1];

    }

    public static void process() {
        for(int i = 1; i < lineTwoLength+1; i++){
            for(int j = 1; j < lineLength+1; j++){
                if(right[i-1] == left[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    if(dp[i-1][j] > dp[i][j-1]){
                        dp[i][j] = dp[i-1][j];
                    }else{
                        dp[i][j] = dp[i][j-1];
                    }
                }
            }
        }
        sb.append(dp[lineTwoLength][lineLength]).append("\n");
//        System.out.println(dp[lineTwoLength][lineLength]);

        int i = lineTwoLength;
        int j = lineLength;

        Stack<Character> stack = new Stack<Character>();
        while(i>=1 && j >=1){
            if(dp[i][j] == dp[i-1][j]){
                i--;
            } else if (dp[i][j] == dp[i][j-1]) {
                j--;
            }else{
                stack.push(right[i-1]);
                i--;
                j--;
            }
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }

    }


    public static void main(String[] args) throws Exception {
        input();
        process();
        System.out.println(sb.toString());
    }
}
