import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int A,B;
    private static ArrayList<Integer> arr = new ArrayList<>();
    private static boolean[] visited;
    private static int answer = -1;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        while (A > 0){
            arr.add(A%10);
            A/=10;
        }

        Collections.sort(arr);
        visited = new boolean[arr.size()];

    }
    public static void recur(int cur, int sum){
        if(cur == arr.size()){
            if(sum < B){
                answer = Math.max(answer,sum);
            }
            return;
        }

        for(int i = 0 ; i < arr.size() ; i++){
            if(visited[i]) continue;

            if(cur == 0 && arr.get(i)==0) continue;
            visited[i] = true;
            recur(cur+1, sum*10+arr.get(i));
            visited[i] = false;
        }
    }

    //실행
    public static void process() {
        recur(0,0);
        System.out.println(answer);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}