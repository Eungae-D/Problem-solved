import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[]arr,prefix;
    private static int min,answer;


    public static void input() throws Exception{
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        arr = new int[N+1];
        prefix = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= N; i++){
            arr[i]= Integer.parseInt(st.nextToken());
            prefix[i] = prefix[i-1]+arr[i];
        }

        min = Integer.MAX_VALUE;
        answer = 0;

    }

    public static void process(){
        for(int i = 1; i <=N; i++){
            int s = i;
            int e = i+1;

            while(s>0 && e<=N){
                int left = prefix[i]-prefix[s-1];
                int right = prefix[e]-prefix[i];

                if(min>Math.abs(right-left)){
                    
                    min = Math.abs(right-left);
                    answer = prefix[e]-prefix[s-1];
                    
                }else if(min == Math.abs(right - left)){
                    answer = Math.max(answer, prefix[e]-prefix[s-1]);
                }

                if(left>=right){
                    e++;
                }else{
                    s--;
                }
            }
        }
        System.out.println(answer);
    }




    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
