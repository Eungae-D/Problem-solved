import java.util.Scanner;

class Main {
    static int[] cnt = new int[8001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //합
        int sum = 0;


        //중앙값
        int medium = 10000;

        // 최빈값
        int mode = 10000;


        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();
            cnt[4000 + number]++;

            sum += number;

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }

        int count = 0;
        int mode_max = 0;

        boolean flag = false;

        for (int i = min + 4000; i <= max + 4000; i++) {
            if (cnt[i] > 0) {
                //아오 알고리즘 왤케 어질어질
                //중앙값
                if (count < (N + 1) / 2) {
                    count += cnt[i];
                    medium = i - 4000;
                }
                //최빈값
                //한번 나왔으면
                if (mode_max < cnt[i]) {
                    mode_max = cnt[i];
                    mode = i - 4000;
                    flag = true;
                } else if (flag == true && mode_max == cnt[i]) {
                    mode = i - 4000;
                    flag = false;
                }
            }
        }
        System.out.println((int) Math.round((float) sum / N));
        System.out.println(medium);
        System.out.println(mode);
        System.out.println(max-min);
    }
}