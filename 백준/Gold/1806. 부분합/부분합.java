import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,S;
    private static int[]arr;
    private static int count = 0;
    private static int min = Integer.MAX_VALUE;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        arr = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    //실행
    public static void process() {
        int s = 0 ;
        int e = 0 ;
        int sum = 0;

        while(s <= N && e <= N){
            if(sum<S){
                sum+=arr[e];
                e++;
            }else{
                sum-=arr[s];
                s++;
            }

            if(sum>=S){
                min = Math.min(min,e-s);
            }
        }

        if(min == Integer.MAX_VALUE){
            System.out.println(0);
        }else System.out.println(min);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
