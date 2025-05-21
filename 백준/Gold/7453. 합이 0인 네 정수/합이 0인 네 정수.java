import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[][] arr;
    private static long cnt = 0;
    private static int[] list1, list2;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        arr = new int[4][N];
        list1 = new int[N * N];
        list2 = new int[N * N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[0][i] = Integer.parseInt(st.nextToken());
            arr[1][i] = Integer.parseInt(st.nextToken());
            arr[2][i] = Integer.parseInt(st.nextToken());
            arr[3][i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void process() {
        int idx = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                list1[idx] = arr[0][i] + arr[1][j];
                list2[idx] = arr[2][i] + arr[3][j];
                idx++;
            }
        }

        Arrays.sort(list1);
        Arrays.sort(list2);

        int s = 0;
        int e = list2.length - 1;

        while (s < list1.length && e >= 0) {
            int a = list1[s];
            int b = list2[e];
            int sum = a + b;

            if (sum == 0) {
                long count1 = 0, count2 = 0;
                while (s < list1.length && list1[s] == a) {
                    count1++;
                    s++;
                }
                while (e >= 0 && list2[e] == b) {
                    count2++;
                    e--;
                }
                cnt += count1 * count2;
            } else if (sum < 0) {
                s++;
            } else {
                e--;
            }
        }

        System.out.println(cnt);
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
