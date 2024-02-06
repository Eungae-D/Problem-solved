import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[] arr;

    public static void input() throws Exception{
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        arr = new int[N];

        for(int i = 0; i <N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void process(){
        long s = 0;
        long e = Long.MAX_VALUE;
        long answer = 0;

        while (s<=e){
            long mid = (s+e)/2;

            if(check(mid)){
                answer=mid;
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        System.out.println(answer);
    }

    public static boolean check(long mid){
        int cnt = 0;
        for(int i = 0 ; i < N ; i++){
            if(arr[i]<mid){
                cnt = 0;
            }else{
                cnt++;
                if(cnt==mid){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
