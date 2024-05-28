import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,D,K,C;
    private static int[] arr;
    private static int[] count;


    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr = new int[N+K-1];

        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0 ; i < K-1 ; i++){
            arr[N++] = arr[i];
        }
//        System.out.println(Arrays.toString(arr));

        count = new int[D+1];
    }

    //실행
    public static void process() {

        int cnt = 0;
        int result = 0;

        for(int i = 0 ; i < N ; i++){
            if(++count[arr[i]]==1) cnt++;

            if(i>=K-1){
                if(i>=K){
                    if(--count[arr[i-K]]==0) cnt--;
                }

                if(count[C] == 0){
                    result = Math.max(result,cnt+1);
                }else{
                    result = Math.max(result,cnt);
                }
            }
        }

        System.out.println(result);

    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
