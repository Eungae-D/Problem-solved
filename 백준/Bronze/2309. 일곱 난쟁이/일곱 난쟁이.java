import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static int[] arr;
    private static int sum = 0;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        arr = new int[9];
        for(int i = 0 ; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);
    }
    
    //과정
    public static void process() {
        outer : for(int i = 0 ; i < 8; i++){
            for(int j = i+1 ; j < 9 ; j++){
                if(sum-arr[i]-arr[j] == 100){
                    for(int k = 0 ; k < 9 ; k++){
                        if( i==k || j ==k ) continue ;
                        sb.append(arr[k]).append("\n");
                    }
                    break outer;
                }
            }
        }
        System.out.println(sb.toString());
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
