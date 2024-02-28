import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int illegal;
    private static int[] arr;
    private static int count;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();


        illegal = Integer.parseInt(br.readLine());

        arr = new int[5];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < 5 ; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] == illegal){
                count++;
            }
        }
    }

    public static void process() {
        System.out.println(count);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
