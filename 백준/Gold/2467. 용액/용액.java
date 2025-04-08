import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int N;
    private static int[] arr;
    private static long min = Long.MAX_VALUE;
    private static int left,right;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void process(){
        int s = 0;
        int e = N-1;

        while(s<e){
            long sum = arr[s]+arr[e];

            
            if(Math.abs(sum) < min){
                min = Math.abs(sum);
                left = s;
                right = e;
            }
            if(sum > 0){
                e--;
            }else if(sum < 0){
                s++;
            }else{
                sb.append(arr[s]+" "+arr[e]);
                return;
            }
        }
        sb.append(arr[left]+" "+arr[right]);
        
        //어이없네 sb.toString()이 여기있으면 틀려?
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
        //어이없네 sb.toString()이 여기있으면 맞고
        System.out.println(sb.toString());
    }
}
