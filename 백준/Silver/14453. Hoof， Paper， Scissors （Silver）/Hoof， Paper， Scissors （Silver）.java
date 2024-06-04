import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int N;
    private static int[][] arr;
    private static int max = Integer.MIN_VALUE;


    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));

        N  = Integer.parseInt(br.readLine());

        arr = new int[N+1][3];
        for(int i = 1 ; i <= N ; i++){
            String line = br.readLine();
            char alphabet = line.charAt(0);

            if(alphabet == 'P'){
                arr[i][0]++;
            }else if(alphabet =='H'){
                arr[i][1]++;
            }else{
                arr[i][2]++;
            }

            arr[i][0] +=arr[i-1][0];
            arr[i][1] +=arr[i-1][1];
            arr[i][2] +=arr[i-1][2];
        }
    }

    public static void process(){
        max = Math.max(arr[N][0],Math.max(arr[N][1],arr[N][2]));
        for(int i = 1 ; i <= N ; i++){
            int l = Math.max(arr[i][0],Math.max(arr[i][1],arr[i][2]));
            int r = Math.max(arr[N][0]-arr[i][0],Math.max(arr[N][1]-arr[i][1], arr[N][2]-arr[i][2]));

            if(l+r>max) max = l+r;
        }
        System.out.println(max);
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
