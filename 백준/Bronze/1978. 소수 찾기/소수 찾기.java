import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int count = 0;
    private static boolean[] arr = new boolean[1010];
    public static void eratosthenes(){
        arr[0] = arr[1] = false;

        for(int i = 2 ; i <= 1000 ; i++){
            if(!arr[i]) continue;

            for(int j = i*i ; j <=1000 ; j+=i){
                arr[j] = false;
            }
        }
    }

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        Arrays.fill(arr,true);
        eratosthenes();

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            process(Integer.parseInt(st.nextToken()));
        }
    }

    //실행
    public static void process(int input) {
        if(arr[input]) count++;
    }


    public static void main(String[] args) throws Exception {
        input();
        System.out.println(count);
    }
}
