import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static double sum, score;
    private static double answer;
    private static double[] grade = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};
    private static String[] mark = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};

    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0 ; i < 20 ; i++){
            String line = br.readLine();
            String[] arr = line.split(" ");
            process(arr);
        }
        answer = sum/score;
    }

    public static void process(String[] arr) {
        for(int i = 0 ; i < grade.length; i++) {
            if (arr[2].equals(mark[i]) && i != 9) {
                sum += grade[i] * Double.valueOf(arr[1]);
                score += Double.valueOf(arr[1]);
            }
        }
    }
    public static void main(String[] args) throws Exception{
        input();
        System.out.printf("%.6f", answer);
    }
}
