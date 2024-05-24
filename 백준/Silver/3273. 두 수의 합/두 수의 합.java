import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int X;
    private static int[] arr;
    private static int count = 0;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        X = Integer.parseInt(br.readLine());
    }

    //실행
    public static void process() {
        int s = 0;
        int e = N-1;


        while(s<e){
            if(arr[s]+arr[e]==X){
                count++;
                s++;
                e--;
            }else if(arr[s]+arr[e]<X){
                s++;
            }else{
                e--;
            }
        }

        System.out.println(count);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
