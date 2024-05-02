import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int T;
    private static int K,E;
    private static int[][] arr = new int[15][15];

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < 15; i++){
            arr[0][i] = i;
        }

        for(int i = 1 ; i < 15; i++){
            int person = 0;
            for(int j = 1 ; j < 15; j++){
                person += arr[i-1][j];
                arr[i][j] = person;
            }
        }

        for(int tc = 0 ; tc<T ; tc++){
            K = Integer.parseInt(br.readLine());
            E = Integer.parseInt(br.readLine());
            process();
        }
    }

    //실행
    public static void process() {
        System.out.println(arr[K][E]);
    }


    public static void main(String[] args) throws Exception {
        input();
    }
}
