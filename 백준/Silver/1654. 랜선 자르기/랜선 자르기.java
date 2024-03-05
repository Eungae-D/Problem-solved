import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int K,N;
    private static int[] arr;
    private static int max = Integer.MIN_VALUE;

    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        arr = new int[K];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max,arr[i]);
        }
    }

    public static void process() {
        long s = 1;
        long e = max;

        while(s<=e){
            long mid = (s+e)/2;

            int cnt = 0;

            for(int i = 0 ; i < arr.length; i++){
                cnt+=arr[i]/mid;
            }

            if(cnt>=N){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        System.out.println(e);
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
