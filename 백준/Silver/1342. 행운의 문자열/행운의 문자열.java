import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static int count, length;
    private static int[] alphabet = new int[27];
    private static String str;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        length = str.length();
        for (int i = 0; i < length; i++) {
            alphabet[str.charAt(i) - 'a']++;
        }
    }

    public static void process() {
        dfs(0, ' ');
        System.out.println(count);
    }

    private static void dfs(int index, char pre) {
        if (index == length) {
            count++;
            return;
        }

        for (int i = 0; i < 27; i++) {
            if (alphabet[i] == 0) continue;

            if (pre != (char) (i + 'a')) {
                alphabet[i]--;
                dfs(index + 1, (char) (i + 'a'));
                alphabet[i]++;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
