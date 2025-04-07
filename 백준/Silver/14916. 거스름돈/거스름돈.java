

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int N;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
    }

    public static void process() {
        int count = 0;

        while (true) {
            if (N % 5 == 0) {
                count += N / 5;
                sb.append(count);
                break;
            } else {
                N -= 2;
                count++;
            }

            if (N < 0) {
                sb.append(-1);
                break;
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
