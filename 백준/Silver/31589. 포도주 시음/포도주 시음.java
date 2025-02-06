import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int N,K;
    private static long[] arr;
    private static int temp;
    private static long answer = 0;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new long[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void process(){
        Arrays.sort(arr);

        if(K == 1 || K == 2) System.out.println(arr[N-1]);
        else{
            answer = arr[N-1];
            int s = 0;
            int e = N-2;
            temp = K-1;
            while(temp>0){
                if(temp / 2 != 0) {

                    answer+=arr[e]-arr[s];
                    e--;
                    s++;
                    temp-=2;
                }else {
                    temp--;
                }

            }
            System.out.println(answer);
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
