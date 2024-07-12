import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,K;
    private static int d = 0;
    private static Queue<Integer> que = new LinkedList<>();
    private static boolean[] visited = new boolean[200010];
    private static int[] mul = {1,1,2};
    private static int[] add = {-1,1,0};

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
    }
    public static void bfs(){
        while(!que.isEmpty()){
            int size = que.size();

            for(int s = 0 ; s < size ; s++){
                int cur = que.poll();

                if(cur == K){
                    System.out.println(d);
                    return;
                }

                for(int i = 0 ; i < 3 ; i++){
                    int nxt = mul[i]*cur + add[i];

                    if(nxt<0 || nxt > 200000 || visited[nxt]) continue;

                    que.add(nxt);
                    visited[nxt] = true;
                }
            }

            d++;
        }
    }

    //실행
    public static void process() {
        if(N==K){
            System.out.println(d);
        }else{
            que.add(N);
            visited[N]= true;
            bfs();
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}