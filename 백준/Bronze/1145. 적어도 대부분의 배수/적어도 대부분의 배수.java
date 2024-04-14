import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int[] arr;
    private static int answer = 0;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        arr = new int[5];
        for(int i = 0 ; i < 5 ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    //실행
    public static void process() {
        outer : for(int i = 1 ; i < 1000000; i++){
            int count = 0;

            for(int j = 0 ; j < 5 ; j++){
                if(i%arr[j] == 0 ){
                    count++;
                }
            }

            if(count>2){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
