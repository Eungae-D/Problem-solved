import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }

        int count = 0;

        for (int i = 123; i <= 987; i++) {
            String candidate = String.valueOf(i);
            if (candidate.charAt(0) == candidate.charAt(1) || candidate.charAt(0) == candidate.charAt(2) || candidate.charAt(1) == candidate.charAt(2)
                    || candidate.contains("0")) {
                continue;
            }

            boolean isValid = true;

            for (int j = 0; j < n; j++) {
                String question = String.valueOf(arr[j][0]);
                int strike = 0;
                int ball = 0;

                for (int k = 0; k < 3; k++) {
                    if (candidate.charAt(k) == question.charAt(k)) {
                        strike++;
                    } else if (candidate.contains(String.valueOf(question.charAt(k)))) {
                        ball++;
                    }
                }

                if (strike != arr[j][1] || ball != arr[j][2]) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                count++;
            }
        }

        System.out.println(count);
    }
}