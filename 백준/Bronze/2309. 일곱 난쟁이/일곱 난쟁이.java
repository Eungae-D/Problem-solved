import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int[]arr = new int[9];
    private static int sum = 0;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        for(int i = 0 ; i < 9 ; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum+=arr[i];
        }

        Arrays.sort(arr);
    }

    //실행
    public static void process() {
        int s = 0;
        int e = 8;

        while(s<e){
            int tmp = sum-arr[s]-arr[e];

            if(tmp == 100){
                for(int i = 0 ; i < 9; i++){
                    if(i == s || i == e) continue;
                    sb.append(arr[i]).append("\n");
                }
                break;
            } else if (tmp < 100) {
                e--;
            } else if (tmp > 100) {
                s++;
            }
        }
        System.out.println(sb.toString());
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}

