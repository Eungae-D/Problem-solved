import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[]arr;
    private static int[]leftDP,rightDP;
    private static int max = Integer.MIN_VALUE;



    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        leftDP = new int[N];
        rightDP = new int[N];
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

    }
    public static void left(){
        for(int i = N-1 ; i >=0 ; i--){
            leftDP[i] = 1;

            for(int j = N-1; j > i; j--){
                if(arr[j] < arr[i] && leftDP[i] < leftDP[j]+1){
                    leftDP[i] = leftDP[j] + 1;
                }
            }
        }
    }
    public static void right(){
        for(int i = 0 ; i < N; i++){
            rightDP[i] = 1;

            for(int j = 0 ; j < i ; j++){
                if(arr[j] < arr[i] && rightDP[i] < rightDP[j]+1){
                    rightDP[i] = rightDP[j]+1;
                }
            }
        }
    }

    public static void process() {
        left();
        right();

        for(int i = 0 ; i < N; i++){
            if(max<leftDP[i]+rightDP[i]){
                max = leftDP[i]+rightDP[i];
            }
        }
        System.out.println(max-1);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
