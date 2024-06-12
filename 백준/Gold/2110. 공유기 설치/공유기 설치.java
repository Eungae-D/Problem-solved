import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,C;
    private static int[] arr;
    private static int answer;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr = new int[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
    }

    //실행
    public static void process() {
        int s = 0;
        int e = arr[N-1];

        while(s<=e){
            int cnt = 1;
            int before = arr[0];

            int mid = (s+e)/2;

            for(int i = 1 ; i < N ; i++){
                if(arr[i]-before>=mid){
                    cnt++;
                    before = arr[i];
                }
            }

            if(cnt>=C){
                answer = mid;
                s = mid+1;
            }else{
                e = mid-1;
            }

        }
        System.out.println(answer);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}