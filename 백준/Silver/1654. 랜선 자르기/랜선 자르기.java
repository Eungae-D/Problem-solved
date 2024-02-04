import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,K,max;
    private static int[] arr;

    public static void input() throws Exception{
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        max = Integer.MIN_VALUE;

        arr= new int[N];

        for(int i = 0 ; i < N ; i ++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max,arr[i]);
        }

    }

    public static void process(){
        long s = 1;
        long e = max;

        while(s<=e){
            long mid = (s+e)/2;
            int cnt = 0;

            for(int i = 0 ; i < N ; i++){
                cnt +=arr[i]/mid;
;            }

            if(cnt>=K){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        System.out.println(e);
    }
    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
