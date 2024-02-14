import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        int[] arr = new int[s.length() + 1];
        int[] cnt = new int[s.length() + 1];
        Map<Integer, Integer> minIdx = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            int n = 0;
            if (s.charAt(i) == 'S') n = 2;
            if (s.charAt(i) == 'K') n = -1;
            arr[i + 1] = arr[i] + n;
            cnt[i + 1] = cnt[i] + (n == 0 ? 0 : 1);
        }

        int ans = -1;

        for (int i = 0; i <= s.length(); i++) {
            if (!minIdx.containsKey(arr[i])) {
                minIdx.put(arr[i], i);
            } else {
                int mid = minIdx.get(arr[i]);
                if (cnt[mid] == cnt[i]) continue;
                ans = Math.max(ans, i - mid);
            }
        }

        System.out.println(ans);

    }
}
