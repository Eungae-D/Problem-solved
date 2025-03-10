import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static BufferedReader br;
    private static int[] arr, prefix;
    private static int N;
    private static String line;
    private static int answer = 0;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));

        line = br.readLine();
        N = line.length();
        arr = new int[N+1];

        for(int i = 1 ; i <= N ; i++){
            arr[i] = line.charAt(i-1)-'0';
        }

        prefix = new int[N+1];
        for(int i = 1 ; i <= N ; i++){
            prefix[i] = prefix[i-1]+arr[i];
        }

    }

    public static void process(){
        for(int s = 0 ; s <= N ; s++){
            for(int e = 2 ; e+s <= N ; e+=2){
                int mid = s+e/2;

                int front = prefix[mid]-prefix[s];
                int back = prefix[s+e]-prefix[mid];

                if(front == back){
                    answer = Math.max(answer, e);
                }
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
