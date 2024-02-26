import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int answer;
    private static int[] arr = new int[10];
    private static int[] visited = new int[10];


    public static void input() throws Exception {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < 10 ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void process(){
        recur(0);
        System.out.println(answer);
    }
    public static boolean check(int cur){
        if(cur>=2 && visited[cur-1]==visited[cur-2] &&visited[cur-2] == visited[cur]){
            return false;
        }
        return true;
    }

    public static void recur(int cur){
        if(cur == 10){
            int score = 0;
            for(int i = 0 ; i < 10 ; i++){
                if(arr[i] == visited[i]) score++;
            }
            if(score>=5) answer++;
            return;
        }
        for(int i = 1; i <=5 ; i++){
             visited[cur] = i;
             if(check(cur)){
                 recur(cur+1);
             }
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
