import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,K;
    private static int[] arr;
    private static int count = 0;
    private static int max = Integer.MIN_VALUE;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st= new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken())%2;
        }
    }

    //실행
    public static void process() {
        int s = 0;
        int e = 0;

        while(e<N){
            if(count<K){
                if(arr[e]==0){
                    e++;
                    max = Math.max(max,e-s-count);

                }else{
                    count++;
                    e++;
                    max = Math.max(max,e-s-count);
                }
            }else{
                if(arr[e]==0){
                    e++;
                    max = Math.max(max,e-s-count);
                }else{
                    if(arr[s]==1){
                        count--;
                    }
                    s++;
                }

            }
        }
        System.out.println(max);

    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}