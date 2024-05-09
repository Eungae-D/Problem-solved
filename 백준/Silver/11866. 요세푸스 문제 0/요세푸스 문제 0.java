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
    private static Queue<Integer> que = new LinkedList<>();

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        for(int i = 1; i <=N ; i++){
            que.add(i);
        }
    }

    //실행
    public static void process() {
        sb.append("<");
        while (!que.isEmpty()){
            for(int i = 0 ; i < K-1; i++){
                que.add(que.poll());
            }
            if(que.size()==1){
                sb.append(que.poll()).append(">");
            }else{
                sb.append(que.poll()).append(", ");
            }
        }
        System.out.println(sb);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
