import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static int N;
    private static Queue<Integer> que = new LinkedList<>();

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for(int i = 1 ; i <= N ; i++){
            que.add(i);
        }
    }

    //실행
    public static void process() {
        if(que.size()==1){
            System.out.println(que.poll());
            return;
        }

        while(!que.isEmpty()){
            que.poll();

            if(que.size()==1){
                System.out.println(que.poll());
                break;
            }

            que.add(que.poll());
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
