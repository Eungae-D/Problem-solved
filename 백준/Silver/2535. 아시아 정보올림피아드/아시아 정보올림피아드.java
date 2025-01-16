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
    private static int[][] arr;

    private static void input() throws Exception{
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        arr = new int[N][3];

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }
    }

    private static void process(){
        Arrays.sort(arr, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                return o2[2] - o1[2];
            }
        });

        sb.append(arr[0][0]+" "+arr[0][1]).append("\n");
        sb.append(arr[1][0]+" "+arr[1][1]).append("\n");

        if(arr[0][0] == arr[1][0]){
            for(int i = 2 ; i < N ; i++){
                if(arr[1][0] != arr[i][0]){
                    sb.append(arr[i][0]+" "+arr[i][1]).append("\n");
                    break;
                }
            }
        }else{
            sb.append(arr[2][0]+" "+arr[2][1]).append("\n");
        }


    }

    public static void main(String[] args) throws Exception{
        input();
        process();
        System.out.println(sb.toString());
    }
}
