import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static int []arr;
    private static int answer;
    private static int max;

    public static void input() throws Exception{
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        arr = new int[N];

        max = Integer.MIN_VALUE;

        for(int i = 0; i <N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max,arr[i]);
        }
        Arrays.sort(arr);

    }

    public static void process(){
        long s = 0;
        long e = max;

        while(s<=e){
            long mid = (s+e)/2;
            long cnt = 0;

            for(int i = 0 ; i < N ; i++){
                if(arr[i]>mid){
                    cnt +=arr[i]-mid;
                }
            }

            if(cnt>=M){
                answer = (int)mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        System.out.println(answer);

    }
    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
