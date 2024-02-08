import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int N;
    private static int[]arr;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N= Integer.parseInt(st.nextToken());
        arr = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i <N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void process(){
        int p1 = 0;
        int p2 = 1;

        while(p1<N){
            
            if(p2 >=N){
                sb.append(-1).append(" ");
                p1++;
            }else if(arr[p1]!=arr[p2]){
                sb.append(p2+1).append(" ");
                p1++;
            }else{
                p2++;
            }

            if(p1 >=p2){
                p2 = p1+1;
            }

        }
        System.out.println(sb);

    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
