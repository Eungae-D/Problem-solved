import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[] arr;
    private static int answer = Integer.MAX_VALUE;
    private static int left,right;

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
    }
    public static void binSearch(int s, int e, int target){
        while(s<=e){
            int mid = (s+e)/2;
            int sum = Math.abs(arr[mid]+target);

            if(sum<answer){
                answer = sum;
                left = target;
                right = arr[mid];
            }

            if(arr[mid]+target<0){
                s = mid+1;
            }else{
                e = mid-1;
            }

        }
    }

    //실행
    public static void process() {
        for(int i = 0 ; i < N-1; i++){
            binSearch(i+1,N-1,arr[i]);
        }
        System.out.println(left+" "+right);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}