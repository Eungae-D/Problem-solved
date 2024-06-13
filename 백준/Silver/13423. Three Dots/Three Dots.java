import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int T,N,ans;
    private static int[] arr;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());

        for(int tc = 0 ; tc<T ; tc++){
            N = Integer.parseInt(br.readLine());

            arr = new int[N];

            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < N ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            process();
        }
    }
    public static boolean binSearch(int s, int e, int target){
        while(s<=e){
            int mid = (s+e)/2;

            if(arr[mid] == target){
                return true;
            }

            if(arr[mid]<target){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return false;
    }

    //실행
    public static void process() {
        Arrays.sort(arr);

        ans = 0;

        for(int i = 0 ; i < N-2 ; i++){
            for(int j = i+1 ; j < N-1; j++){
                int dist = arr[j]-arr[i];

                if(binSearch(j+1,N-1,arr[j]+dist)){
                    ans++;
                }
            }
        }
        sb.append(ans).append("\n");

    }


    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb);
    }
}
