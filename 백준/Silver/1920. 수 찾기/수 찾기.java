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


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N; i++){
            arr[i] =Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < M; i++){
            if(process(Integer.parseInt(st.nextToken()))){
                sb.append('1').append("\n");
            }else{
                sb.append('0').append("\n");
            }
        }
    }

    public static boolean process(int input) {
        int s = 0;
        int e = N-1;

        while(s<=e){
            int mid = (s+e)/2;

            if(input<arr[mid]){
                e = mid-1;

            }else if(input>arr[mid]){
                s = mid+1;
            }else{
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb);
    }
}
