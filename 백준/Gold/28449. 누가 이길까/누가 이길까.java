import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static int[]HIArr,ARCArr;


    public static void input() throws Exception{
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        HIArr = new int[N];
        ARCArr = new int[M];

        st=  new StringTokenizer(br.readLine());

        for(int i = 0 ; i < N ; i++){
            HIArr[i] = Integer.parseInt(st.nextToken());
        }


        st=  new StringTokenizer(br.readLine());

        for(int i = 0 ; i < M ; i++){
            ARCArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(HIArr);

    }

    public static void process(){
        long hiWin = 0,draw = 0, arcWin = 0;

        for(int i = 0 ; i < M; i++){
            int upper = upperBound(ARCArr[i]);
            int lower = lowerBound(ARCArr[i]);

            long d = upper - lower;

            draw += d;
            hiWin += N-upper;
            arcWin +=upper-d;

        }

        System.out.println(hiWin+" "+arcWin+" "+draw);


    }

    public static int upperBound(int x){
        int s = 0;
        int e = N-1;
        int idx = -1;

        while(s<=e){
            int mid = (s+e)/2;
            if(HIArr[mid]>x){
                idx = mid;
                e = mid-1;

            }else{
                s = mid+1;
            }
        }

        if(idx==-1){
            return N;
        }else{
            return idx;
        }
    }

    public static int lowerBound(int x){
        int s = 0;
        int e = N-1;
        int idx = -1;

        while(s<=e){
            int mid = (s+e)/2;
            if(HIArr[mid]>=x){
                idx = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        if(idx == -1){
            return N;
        }else{
            return idx;
        }
    }
    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
