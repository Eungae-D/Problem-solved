import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int N,K;
    private static Queue<Integer> que;
    private static int answer;
    private static int d = 0;
    private static boolean[] visited = new boolean[200010];
    private static int[] mul = {1,1,2};
    private static int[] add = {-1,1,0};

    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        que = new LinkedList<>();
    }
    public static void bfs(){
        while (!que.isEmpty()){
            int sz = que.size();

            for(int s = 0 ; s < sz ; s++){
                int cur = que.poll();

                if(cur == K){
                    System.out.println(d);
                    return;
                }

                for(int i = 0 ; i < 3 ; i++){
                    int nxt = mul[i] * cur + add[i];

                    if(nxt < 0 || nxt > 200000 || visited[nxt]) continue;

                    que.add(nxt);
                    visited[nxt] = true;
                }
            }

            d++;
        }
    }

    public static void process() {
        if(N==K){
            System.out.println(d);
            return;
        }else{
            que.add(N);
            visited[N] = true;
            bfs();
        }
    }
    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
