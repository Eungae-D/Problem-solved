import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int[] arr;
    private static int n,k, max;




    private static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[n+1];

        st = new StringTokenizer(br.readLine());
        max = Integer.MIN_VALUE;

        for(int i = 1; i <=n; i++){
            arr[i] = arr[i-1]+Integer.parseInt(st.nextToken());
        }
    }

    private static void process(){
        for(int i = k; i<=n; i++){
            int temp = arr[i]-arr[i-k];
            if(max<temp){
                max=temp;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
