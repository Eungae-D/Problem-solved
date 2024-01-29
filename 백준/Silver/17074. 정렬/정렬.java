import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int n, mount,count,idx;
    private static int[] arr;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        arr = new int[100002];

        for(int i = 1 ; i <=n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        arr[0] = -100000000;
        arr[n+1] = 100000000;
    }


    public static void process() {
        for(int i = 2; i <= n; i++){
            if(arr[i-1]>arr[i]){
                mount++;
                idx = i ;
            }
        }
        if(mount == 0 ){
            System.out.println(n);
            return;
        }else if(mount>=2){
            System.out.println(0);
            return;
        }
        else{
            if(arr[idx-1]<=arr[idx+1]) count++;
            if(arr[idx-2]<=arr[idx]) count++;
            System.out.println(count);
            return;
        }

    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
