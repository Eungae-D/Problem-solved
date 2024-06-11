import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static int[]arr;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < M ; i++){
            int input = Integer.parseInt(st.nextToken());
            int leftIndex = lowerBound(input);
            int rightIndex = upperBound(input);
            if (leftIndex == -1){
                sb.append(0).append(" ");
            }else{
                sb.append(rightIndex-leftIndex).append(" ");
            }
        }
    }

    //실행
    public static int lowerBound(int input) {
       int s = 0;
       int e = N-1;
       int ans = -1;

       while(s<=e){
           int mid = (s+e)/2;

           if(arr[mid]>=input){
               ans = mid;
               e = mid-1;
           }else{
               s = mid+1;
           }
       }

       return ans;
    }

    public static int upperBound(int input) {
        int s = 0;
        int e = N-1;
        int ans = N;

        while(s<=e){
            int mid = (s+e)/2;

            if(arr[mid]>input){
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;

            }
        }
        return ans;
    }




    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb.toString());
    }
}