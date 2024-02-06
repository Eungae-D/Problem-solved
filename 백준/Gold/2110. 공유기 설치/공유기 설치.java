import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,C;
    private static int[]arr;

    public static void input() throws Exception{
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N= Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr= new int[N];

        for(int i = 0 ; i < N;  i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

    }

    public static void process(){
        int answer = 0;
        int s = 0;
        int e = arr[N-1]+arr[0];

        while(s<=e){
            int cnt = 1;

            int beforeHouse = arr[0];

            int mid = (s+e)/2;

            for(int i = 1; i < N ; i++){
                if(arr[i]-beforeHouse>=mid){
                    cnt++;
                    beforeHouse = arr[i];
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
    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
