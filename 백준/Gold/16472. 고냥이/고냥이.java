import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static String line;
    private static int[]alphabet = new int[26];
    private static int max = Integer.MIN_VALUE;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        line = br.readLine();
        alphabet[line.charAt(0)-'a']++;
    }

    //실행
    public static void process() {
        int s = 0;
        int e = 0;
        int cnt = 1;

        while(true){
            e++;

            if(e == line.length()){
                break;
            }

            int num = line.charAt(e)-'a';
            alphabet[num]++;

            if(alphabet[num] == 1){
                cnt++;
            }

            while(cnt > N){
                int temp = line.charAt(s)-'a';
                alphabet[temp]--;

                if(alphabet[temp] == 0){
                    cnt--;
                }

                s++;
            }

            max = Math.max(max,e-s+1);
        }

        System.out.println(max);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
