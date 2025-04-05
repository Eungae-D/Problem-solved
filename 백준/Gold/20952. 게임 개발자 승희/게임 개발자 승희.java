import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int mod = 1_000_000_007;
    private static int N,M;
    private static int[]A,B;
    private static long bSum;
    private static int[] modA = new int[7];
    private static int[] check = new int[7];

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N];
        B = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            A[i] = Integer.parseInt(st.nextToken());
            //나머지
            modA[A[i]%7]++;
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < M ; i++){
            B[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1 ; i <7 ; i++){
            check[i] = i;
        }
    }

    //실행
    public static void process() {
        for(int i = 0 ; i < M ; i++){
            int temp = B[i]%7;
            int[] copyMod = new int[7];
            int[] copyCheck = new int[7];

            for(int j = 0 ; j < 7 ; j++){
                copyMod = modA.clone();
                copyCheck = check.clone();
            }

            for(int j = 0 ; j < 7 ; j++){
                if(modA[j] == 0) continue;

                copyCheck[j] = (copyCheck[j]+temp)%7;

                if(copyCheck[j] == 0){
                    copyMod[j] = 0;
                }
            }

            int sum = 0;
            for(int j = 0 ; j < 7 ; j++){
                sum += copyMod[j];
            }

            if(sum!=0){
                bSum = (bSum+B[i]) % mod;

                for(int j = 0 ; j < 7 ; j++){
                    modA[j] = copyMod[j];
                    check[j] = copyCheck[j];
                }
            }
        }

        int size = 0;
        for(int i = 0 ; i < N ; i++){
            if(modA[A[i]%7] != 0){
                size++;
            }
        }

        sb.append(size).append("\n");

        for(int i = 0 ; i < N ; i++){
            if(modA[A[i]%7] != 0){
                sb.append((A[i]+bSum%mod)%mod).append(" ");
            }
        }
        System.out.println(sb.toString());
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
