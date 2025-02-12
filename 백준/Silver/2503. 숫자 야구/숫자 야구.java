import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int N;
    private static int[][] arr;
    private static int answer;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        arr = new int[N][3];

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }
    }

    public static void process(){
        for(int i = 123 ; i <= 987 ; i++){
            String comp = String.valueOf(i);

            if(comp.charAt(0) == comp.charAt(1) || comp.charAt(1) == comp.charAt(2) || comp.charAt(2) == comp.charAt(0)
            || comp.contains("0")) continue;

            boolean isValid = true;

            for(int j = 0 ; j < N ; j++){
                String ori = String.valueOf(arr[j][0]);

                int strike = 0;
                int ball = 0;

                for(int k = 0 ; k < 3; k++){
                    if(comp.charAt(k) == ori.charAt(k)){
                        strike++;
                    }else if(ori.contains(String.valueOf(comp.charAt(k)))){
                        ball++;
                    }
                }
                if(strike != arr[j][1] || ball != arr[j][2]){
                    isValid = false;
                    break;
                }
            }

            if(isValid) answer++;
        }
        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
