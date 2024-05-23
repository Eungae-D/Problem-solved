import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static int[]arr;
    private static int total = 0;
    private static int count = 0;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    //실행
    public static void process() {
        int s = 0;
        int e = 0;

        total = arr[0];

        while(s<N && e<N){
            if(total < M){
                e++;
                total +=arr[e];
            }else if(total > M){
                total -=arr[s];
                s++;
            }else{
                count++;
                total -=arr[s];
                s++;
                e++;
                total +=arr[e];
            }
        }

        System.out.println(count);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
