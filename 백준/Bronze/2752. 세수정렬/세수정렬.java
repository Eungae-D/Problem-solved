import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int[] arr;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        arr = new int[3];
        for(int i = 0 ; i < 3; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void process(){
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
