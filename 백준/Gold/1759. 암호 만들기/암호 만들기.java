import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int L,C;
    private static char[]arr,password;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr = new char[C];
        password = new char[L];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < C ; i++){
            arr[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(arr);
    }
    public static int[] addCnt(char x){
        if(x=='a' || x =='e' || x == 'i' || x == 'o' || x == 'u'){
            return new int[] {0,1};
        }else{
            return new int[] {1, 0};
        }
    }

    public static void recur(int cur, int cnt, int a, int b){
        if(cnt == L){
            if(a>=2 && b >=1){
                sb.append(password).append("\n");
            }
            return;
        }

        if(cur == C){
            return;
        }

        int[] count = addCnt(arr[cur]);

        password[cnt] = arr[cur];
        recur(cur+1,cnt+1,a+count[0],b+count[1]);
        recur(cur+1,cnt,a,b);

    }

    //실행
    public static void process() {
        recur(0,0,0,0);
        System.out.println(sb);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}