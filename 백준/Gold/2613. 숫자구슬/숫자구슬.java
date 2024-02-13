import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, m;
    public static int[] arr;
    public static int s, e;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            s = Math.max(s, arr[i]);
            e += arr[i];
        }



        int mid = 0;
        while (s <= e){
            mid = (s + e) / 2;
            int cnt = check(mid);
            if(cnt > m) {
                s = mid+1;
            } else {
                e = mid-1;
            }
        }
        sb.append(s).append("\n");


        int cnt = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum > s){
                m--;
                sum = arr[i];
                sb.append(cnt).append(" ");
                cnt = 1;
            } else {
                cnt++;
            }
           
            if(m == n-i) break;
        }

        for(int i = m ; i >0; i--){
            sb.append(cnt).append(" ");
            cnt = 1;
        }
        System.out.println(sb.toString());
    }



    public static int check(int mid){
        int sum = 0;
        int cnt = 1;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum > mid){
                cnt++;
                sum = arr[i];
            }
        }
        return cnt;
    }
}
