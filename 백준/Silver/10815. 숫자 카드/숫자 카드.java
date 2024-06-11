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

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < M ; i++){
            process(Integer.parseInt(st.nextToken()));
        }
    }

    //실행
    public static void process(int input) {
        int s = 0;
        int e = N-1;

        while (s<=e){
            int mid = (s+e)/2;

            if(arr[mid]<input){
                s = mid+1;
            }else if(arr[mid]==input){
                sb.append(1+" ");
                return;
            }else if(arr[mid]>input){
                e = mid-1;
            }
        }
        sb.append(0+" ");
    }


    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb.toString());
    }
}
