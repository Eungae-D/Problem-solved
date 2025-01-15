import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static boolean[] visited;
    private static int T,count;

    private static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        T = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i < T ; i++){
            String word = br.readLine();
            if(process(word)){
                count++;
            }
        }
    }

    private static boolean process(String word){
        visited = new boolean[26];

        int now = -1;
        for(int i = 0 ; i < word.length() ; i++){
            int temp = word.charAt(i)-'a';

            if(now != temp){
                if(visited[temp] == false){
                    visited[temp] = true;
                    now = temp;
                }else{
                    return false;
                }
            }else{
                continue;
            }
        }

        return true;
    }

    public static void main(String[] args) throws Exception{
        input();
        System.out.println(count);
    }
}
