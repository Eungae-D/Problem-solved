import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int n,h,cnt;
    private static int[] arr,prefix;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        arr = new int[500001];
        prefix = new int[500001];

        for(int i = 0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine());
            int temp = Integer.parseInt(st.nextToken());

            if(i % 2 == 0){
                arr[h-temp+1]++;
            }else{
                arr[1]++;
                arr[temp+1]--;
            }
        }

    }


    public static void process() {

        for(int i = 1 ; i <= h; i++){
            prefix[i] = prefix[i-1]+arr[i];
        }

        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= h; i++){
            min = Math.min(min,prefix[i]);
        }

        cnt = 0;

        for(int i = 1; i <= h; i++){
            if(prefix[i] ==min){
                cnt++;
            }
        }
        System.out.println(min+" "+cnt);

    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
