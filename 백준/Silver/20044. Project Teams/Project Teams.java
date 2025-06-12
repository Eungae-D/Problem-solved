import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static BufferedReader br;
    private static int n;
    private static int[] arr;
    private static int min = Integer.MAX_VALUE;

    private static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()) * 2;
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void process() {
        Arrays.sort(arr);
        
        for (int i = 0; i < n / 2; i++) {
            int sum = arr[i] + arr[n - i - 1];
            if (sum < min) {
                min = sum;
            }
        }
        System.out.println(min);
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
}
