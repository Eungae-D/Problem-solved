import java.util.Scanner;

public class Main {
    private static int y1, m1, d1, y2, m2, d2;

    public static void input() {
        Scanner sc = new Scanner(System.in);
        y1 = sc.nextInt();
        m1 = sc.nextInt();
        d1 = sc.nextInt();
        y2 = sc.nextInt();
        m2 = sc.nextInt();
        d2 = sc.nextInt();
    }

    public static void process() {
        int total1 = calcDay(y1, m1, d1);
        int total2 = calcDay(y2, m2, d2);

        if (y2 - y1 > 1000 || (y2 - y1 == 1000 && (m1 < m2 || (m1 == m2 && d1 <= d2)))) {
            System.out.println("gg");
        } else {
            System.out.println("D-" + (total2 - total1));
        }
    }

    private static int calcDay(int y, int m, int d) {
        int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;

        for (int i = 1; i < y; i++) {
            days += 365 + checkLeap(i);
        }

        for (int i = 1; i < m; i++) {
            if (i == 2) days += checkLeap(y);
            days += day[i];
        }

        days += d;
        return days;
    }

    private static int checkLeap(int y) {
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) return 1;
        return 0;
    }

    public static void main(String[] args) {
        input();
        process();
    }
}
