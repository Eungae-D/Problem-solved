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
    private static int sum = 0;

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
        }
    }

    //실행
    public static void process() {
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if(i==j) continue;
                for(int k = 0 ; k < N ; k++){
                    if( i==k || j==k || i==k) continue;

                    if(arr[i]+arr[j]+arr[k] <= M && sum < arr[i]+arr[j]+arr[k]){
                        sum = arr[i]+arr[j]+arr[k];
                    }
                }
            }
        }
        System.out.println(sum);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
