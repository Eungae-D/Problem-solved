import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int n,max;
    private static int[][] arr;

    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());

        arr = new int[100001][3];

        for(int i = 1; i <= n; i++){
            st = new StringTokenizer(br.readLine());
            int ch = st.nextToken().charAt(0);
            if(ch=='P') {
                arr[i][0]++;
            } else if (ch=='H') {
                arr[i][1]++;
            }else{
                arr[i][2]++;
            }
            arr[i][0] += arr[i-1][0];
            arr[i][1] += arr[i-1][1];
            arr[i][2] += arr[i-1][2];
        }
    }

    public static void process() {
        max = Math.max(arr[n][0], Math.max(arr[n][1],arr[n][2]));
        for(int i = 1 ; i <=n;i++ ){
            int left = Math.max(arr[i][0], Math.max(arr[i][1],arr[i][2]));
            int right = Math.max(arr[n][0]-arr[i][0], Math.max(arr[n][1]-arr[i][1],arr[n][2]-arr[i][2]));

            if(left+right>max){
                max = left + right;
            }

        }
        System.out.println(max);

    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
