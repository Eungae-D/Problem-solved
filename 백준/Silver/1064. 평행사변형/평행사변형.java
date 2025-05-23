import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    private static int[] points = new int[6];

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            points[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void process() {
        if ((points[2] - points[0]) * (points[5] - points[1]) ==
            (points[4] - points[0]) * (points[3] - points[1])) {
            System.out.println(-1);
            return;
        }

        double ab = getLength(points[0], points[1], points[2], points[3]);
        double bc = getLength(points[2], points[3], points[4], points[5]);
        double ca = getLength(points[4], points[5], points[0], points[1]);

        double max = Math.max(ab, Math.max(bc, ca));
        double min = Math.min(ab, Math.min(bc, ca));

        System.out.println(2 * (max - min));
    }

    public static double getLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static void main(String[] args) throws IOException {
        input();
        process();
    }
}