import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,H;
    private static int[]arr,prefix;
    private static int min = Integer.MAX_VALUE;
    private static int count = 0;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        arr = new int[H+1];
        prefix = new int[H+1];
        for(int i = 0 ; i < N ; i++){
            int num = Integer.parseInt(br.readLine());
            if(i%2==1){
                arr[1]++;
                arr[num+1]--;
            }else{
                arr[H-num+1]++;
            }
        }
    }

    //실행
    public static void process() {
        for(int i = 1; i <= H ; i++){
            prefix[i] = prefix[i-1]+arr[i];
            min = Math.min(min,prefix[i]);
        }

        for(int i = 1; i <= H ; i++){
            if(prefix[i] == min){
                count++;
            }
        }

        System.out.println(min+" "+count);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
