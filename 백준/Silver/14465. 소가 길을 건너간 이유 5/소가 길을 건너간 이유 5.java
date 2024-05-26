import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,K,B;
    private static boolean[] arr;
    private static int count = 0;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        arr = new boolean[N+1];
        
        for(int i = 1 ; i <=B ; i++){
            arr[Integer.parseInt(br.readLine())] = true;
        }
    }

    //실행
    public static void process() {
        for(int i = 1 ; i <=K ; i++){
            if(arr[i]) count++;
        }

        int s = 1;
        int e = K;

        int min = Integer.MAX_VALUE;

        while(e<N){
            if(arr[s] && !arr[e+1]){
                count--;
            }else if(!arr[s] && arr[e+1]){
                count++;
            }
            min = Math.min(min,count);
            s++;
            e++;

        }

        System.out.println(min);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
