import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int n,m;
    private static int[] arr;

    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        
        st = new StringTokenizer(br.readLine());
        m= Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < m ; i++){
            process(Integer.parseInt(st.nextToken()));
        }


    }

    public static void process(int x){
        int s = 0;
        int e = n-1;
        int ans = 0;

        while(s<=e){
            int mid = (s+e)/2;

            if(arr[mid]==x){
                ans = 1;
                break;
            } else if (arr[mid]<x) {
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        System.out.print(ans+" ");

    }

    public static void main(String[] args) throws Exception{
        input();
    }
}
