import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[][] arr;
    private static int count = 0;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        arr = new int[N][3];

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 3 ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    //실행
    public static void process() {
        for(int i = 123 ; i <= 987 ; i++){
            String comp = String.valueOf(i);

            if(comp.charAt(0) == comp.charAt(1) || comp.charAt(1) == comp.charAt(2) || comp.charAt(2) == comp.charAt(0) || comp.contains("0")) continue;

            boolean isValid = true;

            for(int j = 0 ; j < N ; j++){
                String q = String.valueOf(arr[j][0]);
                int strike = 0;
                int ball = 0;

                for(int k = 0 ; k < 3 ; k++){
                    if(comp.charAt(k) == q.charAt(k)){
                        strike++;
                    }else if(comp.contains(String.valueOf(q.charAt(k)))){
                        ball++;
                    }
                }

                if(strike != arr[j][1] || ball != arr[j][2]){
                    isValid = false;
                    break;
                }
            }

            if(isValid) count++;
        }

        System.out.println(count);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
