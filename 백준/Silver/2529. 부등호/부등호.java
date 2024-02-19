import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    //2번 템플릿 (순열)
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder ans;
    private static int K;
    private static char[] sign;
    private static int[] arr;
    private static boolean[] visited;
    private static String max = "";
    private static String min = "9999999999";

    public static void input() throws Exception {
        br= new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        ans = new StringBuilder();

        K = Integer.parseInt(st.nextToken());
        sign = new char[K];
        arr = new int[K+1];
        visited = new boolean[10];

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < K; i++){
            sign[i] = st.nextToken().charAt(0);
        }

    }

    public static void process(){
        recur(0);
    }

    public static void recur(int cur){
        if(cur == K+1){
            //여기서 조건 만족하는지 확인
            int count = 0;
            for(int i = 1 ; i <= K; i++){
                char temp = sign[i-1];
                if(temp == '<'){
                    if(arr[i-1]<arr[i]){
                        count++;
                    }
                }else{
                    if(arr[i-1]>arr[i]){
                        count++;
                    }
                }
            }

            if(count==K){
                StringBuilder sb = new StringBuilder();
                for(int i = 0 ; i < K+1; i++){
                    sb.append(arr[i]);
                }

                String current = sb.toString();
                if(current.compareTo(min)<0) min = current;
                if(current.compareTo(max)>0) max = current;


            }


            return;
        }

        for(int i = 0 ; i < 10; i++){
            if(visited[i]) continue;
            visited[i] = true;
            arr[cur] = i;
            recur(cur+1);
            visited[i] = false;
        }
    };

    public static void main(String[] args) throws Exception{
        input();
        process();
        System.out.println(max);
        System.out.println(min);

    }
}
