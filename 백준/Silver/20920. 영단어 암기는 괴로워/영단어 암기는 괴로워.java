import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;

    private static int n, m;
    private static Map<String, Integer> map;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (word.length() < m) continue;
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
    }

    public static void process() {
        List<String> words = new ArrayList<>(map.keySet());

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                int countDiff = Integer.compare(map.get(b), map.get(a));
                if (countDiff != 0) return countDiff;

                int lengthDiff = Integer.compare(b.length(), a.length());
                if (lengthDiff != 0) return lengthDiff;

                return a.compareTo(b);
            }
        });

        for (String word : words) {
            sb.append(word).append("\n");
        }

        System.out.print(sb);
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
