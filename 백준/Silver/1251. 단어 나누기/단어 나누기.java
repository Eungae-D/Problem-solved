import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static String s;

    public static void input() throws Exception {
        s = br.readLine();
    }

    public static void process() {
        int len = s.length();
        List<String> arr = new ArrayList<>();

        for (int a = 1; a < len; a++) {
            for (int b = a + 1; b < len; b++) {
                arr.add(getWord(s, a, b));
            }
        }

        Collections.sort(arr);
        System.out.println(arr.get(0));
    }

    private static String getWord(String s, int a, int b) {
        StringBuilder s1 = new StringBuilder(s.substring(0, a));
        StringBuilder s2 = new StringBuilder(s.substring(a, b));
        StringBuilder s3 = new StringBuilder(s.substring(b));
        return s1.reverse().append(s2.reverse()).append(s3.reverse()).toString();
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
