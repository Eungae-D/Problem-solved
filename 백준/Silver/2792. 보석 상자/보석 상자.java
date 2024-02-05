import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int N, M,max;
    private static int[]arr;
    private static int answer;

    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        for(int i = 0 ; i < M; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }
    }

    public static void process(){
        int s = 1 ;
        int e = max;
        while (s<=e){
            int mid = (s+e)/2;
            int count = 0;

            for(int i = 0 ; i < M ; i ++){
                count += arr[i]/mid;
                if(arr[i]%mid!=0){
                    count++;
                }
            }

            if(count>N){
                s = mid+1;
            }else{
                e = mid-1;
                answer = mid;
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
