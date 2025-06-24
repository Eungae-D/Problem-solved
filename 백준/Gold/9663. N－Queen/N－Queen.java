import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int n;
    private static int[] arr;
    private static int count = 0;

    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());

        arr = new int[n];
    }

    public static boolean possible(int col){
        for(int i = 0 ; i < col; i++){

            //같은 행
            if(arr[i] == arr[col]){
                return false;
            }

            //대각선
            else if(Math.abs(col-i) == Math.abs(arr[col]-arr[i])){
                return false;
            }
        }

        return true;
    }

    public static void recur(int cur){
        if(cur == n){
            count++;
            return;
        }

        for(int i = 0 ; i < n ; i++){
            arr[cur] = i;
            if(possible(cur)){
                recur(cur+1);
            }
        }
    }

    public static void process(){
        recur(0);
        System.out.println(count);
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
