import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int N,C,W;
    private static int[]arr;
    private static int max;
    private static long ans;

    public static void input()throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N =Integer.parseInt(st.nextToken());
        C =Integer.parseInt(st.nextToken());
        W =Integer.parseInt(st.nextToken());

        arr = new int[N];

        max = Integer.MIN_VALUE;
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max,arr[i]);
        }
        ans = Long.MIN_VALUE;


    }
    public static void process(){
        for(int i = 1 ; i <=max; i++){
            long sum = 0;
            for(int j = 0 ; j < N; j++){
                int cut = 0;
                if(arr[j]>=i){
                    if(arr[j]%i==0){
                        cut = arr[j]/i-1;
                    }else{
                        cut = arr[j]/i;
                    }

                    int temp = W*i*(arr[j]/i)-cut*C;

                    if(temp>0){
                        sum+=temp;
                    }

                }


                ans = Math.max(ans,sum);
            }
        }
        System.out.println(ans);


    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}

