import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int T;
    private static int N,M;
    private static LinkedList<int[]> que;
    private static int count;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());

        for(int tc = 0 ; tc < T ; tc++){
            st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            que = new LinkedList<>();
            for(int i = 0 ; i < N ; i++){
                que.add(new int[] {Integer.parseInt(st.nextToken()) , i});
            }

            process();
        }
    }

    //실행
    public static void process() {
        count = 0 ;

        while(!que.isEmpty()){
            int[] q = que.poll();
            boolean max = true;

            for(int i = 0 ; i < que.size() ; i++){
                if(q[0] < que.get(i)[0]){
                    que.add(q);
                    for(int j = 0 ; j < i ; j++){
                        que.add(que.poll());
                    }

                    max = false;
                    break;
                }
            }

            if(!max) continue;

            count++;
            if(q[1] == M){
                break;
            }
        }

        sb.append(count).append("\n");
    }


    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb);
    }
}
