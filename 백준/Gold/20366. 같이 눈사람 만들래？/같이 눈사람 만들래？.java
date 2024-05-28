import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static long[] arr;
    private static long min = Long.MAX_VALUE;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        arr = new long[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

    }

    //실행
    public static void process() {
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if(i == j ) continue;

                long snow = arr[i] + arr[j];

                int s = 0;
                int e = N-1;

                while(s<e){
                    if(s==i || s==j){
                        s++;
                        continue;
                    }

                    if(e==i || e==j){
                        e--;
                        continue;
                    }

                    min = Math.min(min,Math.abs((arr[i]+arr[j]) - (arr[s]+arr[e])));

                    if(arr[s]+arr[e]>arr[i]+arr[j]){
                        e--;
                    }else{
                        s++;
                    }
                }
            }
        }
        System.out.println(min);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
