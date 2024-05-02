import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static int N;
    private static ArrayList<Integer> list = new ArrayList<Integer>();

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N ; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
    }

    //실행
    public static void process() {
        Collections.sort(list);

        for(int answer : list){
            sb.append(answer).append("\n");
        }

        System.out.println(sb);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
