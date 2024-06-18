import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[] arr;
    private static int[] operators = new int[4];
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < 4 ; i++){
            operators[i] = Integer.parseInt(st.nextToken());
        }
    }
    public static void recur(int cur, int sum){
        if(cur == N){
            max = Math.max(max,sum);
            min = Math.min(min,sum);
            return;
        }

        for(int i = 0 ; i < 4 ; i ++){
            if(operators[i]>0){
                operators[i]--;
                switch (i){
                    case 0:
                        recur(cur+1,sum+arr[cur]);
                        break;
                    case 1:
                        recur(cur+1,sum-arr[cur]);
                        break;
                    case 2:
                        recur(cur+1,sum*arr[cur]);
                        break;
                    case 3:
                        recur(cur+1,sum/arr[cur]);
                        break;
                }
                operators[i]++;
            }
        }
    }

    //실행
    public static void process() {
        recur(1,arr[0]);
        System.out.println(max);
        System.out.println(min);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}