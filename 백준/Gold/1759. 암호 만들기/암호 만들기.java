import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int L, C;
    private static char[] characters, password;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        characters = new char[C];
        password = new char[L];


        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < C; i++) {
            characters[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(characters);
    }

    public static void process() {
        recur(0, 0);
        System.out.println(sb);
    }

    public static void recur(int cur,int start) {
        if(cur == L) {
            if(isValid(password)) {
                for(char c : password) sb.append(c);
                sb.append('\n');
            }
            return;
        }

        for(int i = start; i < C; i++) {
            password[cur] = characters[i];
            recur(cur + 1, i + 1);
        }
    }
    
    private static boolean isValid(char[] arr) {
        int v = 0; // 모음
        int c = 0; // 자음

        for(char temp : arr) {
            if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') v++;
            else c++;
        }

        return v >= 1 && c >= 2;
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
