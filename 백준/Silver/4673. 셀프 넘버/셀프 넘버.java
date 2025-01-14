import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
//    private static BufferedReader br;
//    private static StringTokenizer st;
    private static boolean[] visited = new boolean[10001];

    private static void input() throws Exception{
        sb = new StringBuilder();
//        br = new BufferedReader(new InputStreamReader(System.in));
//        st = new StringTokenizer(br.readLine());
    }
    private static int answer(int num){
        int sum = num;

        while(num != 0){
            sum += num%10;
            num = num/10;
        }
        return sum;
    }

    private static void process(){
        for(int i = 1 ; i < 10001; i++){
            int n = answer(i);

            if(n < 10001){
                visited[n] = true;
            }
        }

        for(int i = 1 ; i < 10001 ; i++){
            if(!visited[i]){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
