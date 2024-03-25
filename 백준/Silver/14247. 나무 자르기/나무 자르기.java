import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[][]arr;
    private static long answer = 0;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        arr = new int[N][2];

        for(int i = 0 ; i < 2; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < N; j++){
                arr[j][i] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]){
                    return o1[0]-o2[0];
                }
                return o1[1]-o2[1];
            }
        });
    }

    public static void process() {
        for(int i = 0 ; i < N ; i++){
            answer+= arr[i][0]+arr[i][1]*i;
        }
        System.out.println(answer);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
