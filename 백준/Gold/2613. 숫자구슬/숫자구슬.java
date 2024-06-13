import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static int[] arr;
    private static int s = Integer.MIN_VALUE ,e = 0;
    private static int min;
    private static int marbleCount;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            s = Math.max(s,arr[i]);
            e += arr[i];
        }
    }
    public static int searchMarbleGroup(int boundary){
        int cnt = 1;
        int sum = 0;

        for(int i = 0 ; i < N ; i++){
            sum+=arr[i];
            if(sum>boundary){
                cnt++;
                sum = arr[i];
            }
        }
        return cnt;
    }

    //실행
    public static void process() {
        while(s<=e){
            int mid = (s+e)/2;

            int count = searchMarbleGroup(mid);

            if(count>M){
                s = mid+1;
            }else{
                min = mid;
                e = mid-1;
            }
        }
        sb.append(min).append("\n");

        int sum = 0;
        int cnt = 0;
        for(int i = 0 ; i < N ; i++){
            sum+= arr[i];

            if(sum>min){
                M--; //2
                sum = arr[i];
                sb.append(cnt).append(" ");
                cnt = 1; //1
            }else{
                cnt++;
            }

            if(M == N-i) break;
        }
        for(int i = 0 ; i < M ; i++){
            sb.append(cnt).append(" ");
            cnt = 1;
        }
        System.out.println(sb);

    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}