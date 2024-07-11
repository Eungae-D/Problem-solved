import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[]arr;
    private static int maxIndex = 0;
    private static int maxValue = 0;
    private static int count = 0;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        arr = new int[N];

        for(int i = 0 ; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    public static void process() {
        if(N==1){
            System.out.println(0);
            return;
        }
        while(N>1){
            for(int i = 1; i < N; i++){
                if(arr[i] > maxValue){
                    maxIndex = i;
                    maxValue = arr[i];
                }
            }

            if(arr[0] > maxValue){
                System.out.println(count);
                return;
            }else {
                arr[maxIndex]--;
                maxValue--;
                arr[0]++;
                count++;
            }
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}