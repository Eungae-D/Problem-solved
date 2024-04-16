import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,K;
    private static int[][] arr;
    private static int max = Integer.MAX_VALUE;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N][3];
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }
    }

    //실행
    public static void process() {
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                for(int k = 0 ; k < N ; k++){
                    int count = 0;

                    for(int l = 0 ; l < N ; l++){
                        if(arr[i][0] >=arr[l][0] && arr[j][1] >= arr[l][1] && arr[k][2]>= arr[l][2]){
                            count++;
                        }
                    }

                    if(count>=K){
                        max = Math.min(max,arr[i][0]+arr[j][1]+arr[k][2]);
                    }
                }
            }
        }
        System.out.println(max);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
