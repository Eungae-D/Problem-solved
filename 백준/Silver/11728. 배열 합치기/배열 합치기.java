import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M;
    private static int[] arrA,arrB;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arrA = new int[N];
        arrB = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < M ; i++){
            arrB[i] = Integer.parseInt(st.nextToken());
        }
    }

    //실행
    public static void process() {
        int s = 0;
        int e = 0;

        while (s<N && e<M){
            if(arrA[s] <= arrB[e]){
                sb.append(arrA[s]+" ");
                s++;
            }else{
                sb.append(arrB[e]+" ");
                e++;
            }
        }

        if(s==N){
            for(int i = e ; i < M; i++){
                sb.append(arrB[i]+" ");
            }
        }else{
            for(int i = s ; i < N ; i++){
                sb.append(arrA[i]+" ");
            }
        }
//        if(e==M){
//            for(int i = s ; i < N ; i++){
//                sb.append(arrA[i]+" ");
//            }
//        }

        System.out.println(sb);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
