import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;

    private static int T,N, ans;
    private static int[]arr;

    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        T = Integer.parseInt(st.nextToken());

        for(int tc = 0 ; tc<T ; tc++){
            st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());

            arr = new int[N];

            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < N; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            process();
        }
    }



    public static void process(){
        Arrays.sort(arr);
        ans=0;

        for(int i = 0 ; i < N-2;i++){ //a점
            for(int j = i+1; j<N-1; j++){ //b 점
                int dist = Math.abs(arr[j]-arr[i]); //b-a의 거리

                if(binSearch(j+1,N-1,arr[j]+dist)){
                    ans++;
                }
            }
        }
        sb.append(ans).append("\n");
    }


    public static boolean binSearch(int s, int e, int target){
        while(s<=e){
            int mid = (s+e)/2;

            if(arr[mid]==target){
                return true;
            }

            if(arr[mid]<target){
                s = mid+1;
            }else{
                e =mid-1;
            }
        }
        return false;
    }




    public static void main(String[] args) throws Exception{
        input();
        System.out.println(sb);
    }
}
