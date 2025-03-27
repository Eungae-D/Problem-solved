import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static String temp;
    private static int num, count;
    private static boolean[] visited;
    private static char[] chars;
    private static String answer;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while((line = br.readLine()) != null){
            st = new StringTokenizer(line);

            temp = st.nextToken();
            num = Integer.parseInt(st.nextToken());

            process();
        }
    }

    public static void process(){
        count = 0;
        chars = new char[temp.length()];
        visited = new boolean[temp.length()];

        recur(temp,0);

        if(count < num) answer = "No permutation";

        System.out.println(temp + " " + num + " = " + answer);
    }

    public static void recur(String temp, int cnt){
        if(cnt == temp.length()){
            count++; 
            if(count == num) {
                answer = new String(chars); 
            }
            return;
        }


        for(int i = 0; i < temp.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                chars[cnt] = temp.charAt(i); 
                recur(temp, cnt + 1);
                visited[i] = false; 
            }
        }
    }

    public static void main(String[] args) throws Exception{
        input();
    }
}
