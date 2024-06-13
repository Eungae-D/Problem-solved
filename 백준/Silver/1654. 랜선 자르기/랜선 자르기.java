import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int K,N;
    private static int[] arr;
    private static int max = -1;
    private static long answer;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        arr = new int[K];

        for(int i = 0 ; i < K ; i++){
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max,arr[i]);
        }
    }

    //실행
    public static void process() {
        long s = 1;
        long e = max;

        while(s<=e){
            int count = 0;

            long mid = (s+e)/2;

            for(int i = 0 ; i < K ; i++){
                count+=arr[i]/mid;
            }

            if(N>count){
                e = mid-1;
            }else{
                answer = mid;
                s = mid+1;
            }

        }

        System.out.println(answer);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}