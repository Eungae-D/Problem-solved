import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int[] arr,prefix,suffix;
    private static int n,ans;

    private static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        arr = new int[1002];
        prefix = new int[1002];
        suffix = new int[1002];

        for(int i = 0; i <n; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            arr[x] = Integer.parseInt(st.nextToken());
        }
    }

    private static void process(){
        for(int i = 1 ; i <=1000; i++){
            prefix[i] = Math.max(prefix[i-1],arr[i]);
        }


        for(int i = 1000 ; i >=1; i--){
            suffix[i] = Math.max(suffix[i+1],arr[i]);
        }


        for(int i = 1 ; i <=1000; i++){
            ans+=Math.min(prefix[i],suffix[i]);
        }
        
        System.out.println(ans);

    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
