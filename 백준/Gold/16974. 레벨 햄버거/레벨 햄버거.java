import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static long X;
    private static long[] total,patty;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        X = Long.parseLong(st.nextToken());

        total = new long[N+1];
        patty = new long[N+1];
        total[0] = 1;
        patty[0] = 1;

        for(int i = 1; i <= N; i++){
            total[i] = total[i-1]*2+3;
            patty[i] = patty[i-1]*2+1;
        }
    }
    public static long recur(int n, long x){
        if(n==0){
            if(x==0) return 0;
            else if (x==1) {
                return 1;
            }
        }

        if(x == 1){
            return 0;
        }
        else if(x<= total[n-1]+1){ // 1보다 크고 중앙보다 작고
            return recur(n-1,x-1);
        }else if(x == total[n-1]+2){ //중앙
            return patty[n-1]+1;
        }else if(x <= total[n-1]*2+2){ //중앙보다크고 맨 왼쪽보다 작고
            return patty[n-1]+1+recur(n-1,x-(2+total[n-1]));
        }else{
            return patty[n-1]*2+1; //맨 왼쪽
        }
    }

    //실행
    public static void process() {
        long ans = recur(N,X);
        System.out.println(ans);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}