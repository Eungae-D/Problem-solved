import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static int[] arr;
    private static int max = -1;
    private static long answer;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }

    }

    //실행
    public static void process() {
        long s = 0;
        long e = max;
        while (s<=e){
            long tree = 0;

            long mid = (s+e)/2;

            for(int i = 0 ; i < N ; i++){
                if(arr[i]>mid){
                    tree+=arr[i]-mid;
                }
            }

            if(tree >= M){
                answer = mid;
                s = mid+1;
            }else{
                e = mid-1;
            }
        }

        System.out.println(answer);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}